import axios from "axios";
import { useState } from "react";

function ItemEdit(props) {

    const [name, setName] = useState('');
    const [price, setPrice] = useState(0);

    const nameChangedHandler = (event) => {
        // console.log('name changed!');
        // console.log(event.target.value)
        setName(event.target.value)
    }
    const priceChangedHandler = (event) => {
        setPrice(event.target.value)
    }

    const submitFormHandler = (event) => {
        event.preventDefault();
        // console.log("submitted");
        axios.post(process.env.REACT_APP_API_URL + '/item', {
            name : name,
            price : price
        }).then(response => {
            // console.log("sent to server");
            setName('');
            setPrice(0);
            props.onSave();
        })
    }

    return (
        <div>
            <form onSubmit={submitFormHandler}>
                Name: <input type="text" value={name} onChange={nameChangedHandler} />
                <br />
                Price: <input type="number" value={price} onChange={priceChangedHandler} />
                <br />
                <button>Save</button>
            </form>
        </div>
    )
}

export default ItemEdit;