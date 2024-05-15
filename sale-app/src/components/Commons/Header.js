import { useEffect, useState } from "react";
import { Button, Col, Container, Nav, Navbar, NavDropdown, Row } from "react-bootstrap";
import { Form, Link, useNavigate } from "react-router-dom";
import API, { endpoints } from "../configs/API";
import MySpinner from "./MySpinner";

const Header = () => {
    const [cates, setCates] = useState(null)
    const [q, setQ] = useState("");
    const nav = useNavigate();



    const loadCates = async () => {
      try{
        let res = await API.get(endpoints["categories"])
        setCates(res.data)
      } catch(ex){
        console.error(ex)
      }

    }

    useEffect(() => {loadCates()}, [])

    const search = (e, cateId) => {
      e.preventDefault();
     
      // setCateId(cateId);
      nav(`/?cateId=${cateId}`)
  }

    const submit = (e) => {
        e.preventDefault();

        nav(`/?kw=${q}`);
    }

    return (
        <Navbar expand="lg" className="bg-body-tertiary">
        <Container>
          <Navbar.Brand href="#home">E-commerce Website</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link href="#home">Trang chủ</Nav.Link>
              <NavDropdown title="Danh mục" id="basic-nav-dropdown">
                {cates===null?<MySpinner />:<>
                  {cates.map(c => <Link className="nav-link" key={c.id}>{c.name}</Link>)}
                </>}
              </NavDropdown>          
            </Nav>
          </Navbar.Collapse>
          <Form inline onSubmit={submit}>
              <Row>
                  <Col xs="auto">
                      <Form.Control type="text" value={q} onChange={e => setQ(e.target.value)}  placeholder="Tìm sản phẩm..." className="mr-sm-2" />
                      
                  </Col>
                  <Col xs="auto">
                      <Button type="submit">Tìm kiếm</Button>
                  </Col>
              </Row>
          </Form>
        </Container>
      </Navbar>
    )
        
    
}

export default Header;