import './App.css';
import Dashboard from './component/Dashboard';
import Footer from './component/Footer';
import Navbar from './component/Navbar';

function App() {
    return (
        <div className="App">
            <Navbar />

            <Dashboard />

            <Footer />
        </div>
    );
}

export default App;