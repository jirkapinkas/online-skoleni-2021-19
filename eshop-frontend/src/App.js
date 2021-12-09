// import logo from './logo.svg';
// import './App.css';
// import './util/Util'
// import {Stuff} from './util/Util'
import Header from './components/Header';
import Footer from './components/Footer';
import { v4 as uuidv4 } from 'uuid';+

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Header />
          {uuidv4()}
        <Footer />
      </header>
    </div>
  );
}

export default App;
