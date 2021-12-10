import { Button, Input } from "@mui/material";
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
                New Item:
                <br />
                <Input placeholder="Name" type="text" value={name} onChange={nameChangedHandler} />
                <br />
                <Input placeholder="Price" type="number" value={price} onChange={priceChangedHandler} />
                <br />
                <Button type="submit" variant="outlined">Save</Button>
            </form>
        </div>
    )
}

export default ItemEdit;