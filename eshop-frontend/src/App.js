// import logo from './logo.svg';
// import './App.css';
// import './util/Util'
// import {Stuff} from './util/Util'
import Header from './components/Header';
import Footer from './components/Footer';
import { v4 as uuidv4 } from 'uuid';
import ItemList from './components/ItemList';
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import About from './components/About';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Header />
        
        <BrowserRouter>
          <Link to="/">Home</Link>
          &nbsp;|&nbsp;
          <Link to="/about">About</Link>
          <Routes>
            <Route path="/" element={<ItemList />} />
            <Route path="about" element={<About />} />
          </Routes>
        </BrowserRouter>
        
        {uuidv4()}
        <Footer fromDate={2000} toDate={2021} />
      </header>
    </div>
  );
}

export default App;
