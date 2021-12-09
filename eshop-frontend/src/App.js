// import logo from './logo.svg';
// import './App.css';
// import './util/Util'
// import {Stuff} from './util/Util'
import Header from './components/Header';
import Footer from './components/Footer';
import { v4 as uuidv4 } from 'uuid';
import ItemList from './components/ItemList';
import ItemEdit from './components/ItemEdit';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Header />
        <ItemList />
        <ItemEdit />
          {uuidv4()}
        <Footer fromDate={2000} toDate={2021} />
      </header>
    </div>
  );
}

export default App;
