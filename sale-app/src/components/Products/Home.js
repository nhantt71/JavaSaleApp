import { useEffect, useState } from "react";
import Footer from "../Commons/Footer";
import Header from "../Commons/Header";
import { useSearchParams } from "react-router-dom";
import API, { endpoints } from "../configs/API";

const Home = () => {
    const [products, setProducts] = useState([])
    const [loading, setLoading] = useState(false)
    let [q, ] = useSearchParams()
    const loadProducts = async () => {
        setLoading(true)
        try{
            let url = 'products'

            let res = await API.get(endpoints['products'])
            setProducts(res.data)
        } catch(ex){
            console.error(ex)
        } finally {
            setLoading(false)
        }
    }

    useEffect(() => {
        loadProducts()
    }, [])

    return (
        <><Header />
        <h1>Danh sách danh mục</h1>
        <Footer /></>
    )
}

export default Home;