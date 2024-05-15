import axios from "axios"

const BASE_URL = "http://localhost:8085/SaleWeb/"

export let endpoints = {
    'categories': '/api/categories/',
    'products': '/api/products/',
}

export default axios.create({
    baseURL: BASE_URL
})