import axios from "axios";
import { useEffect, useState } from "react";
import Item from "./Item";

function ItemList() {

    let initialData = [];
    const [data, setData] = useState(initialData);
  
    const loadData = () => {
        axios.get(process.env.REACT_APP_API_URL + '/item')
            .then(response => {
                // console.log(response.data);
                setData(response.data);
            });
    }
    useEffect(() => {
        loadData();
      }, []);

    // const data = [
    //     {
    //         id : 1,
    //         name : "first",
    //         price : 123
    //     },
    //     {
    //         id : 2,
    //         name : "second",
    //         price : 321
    //     }
    // ];
    // data.forEach(item => console.log(item));

    // const someFunction = function() {
    //     console.log("stuff " + this);
    // }
    // someFunction();
    
    // const someArrowFunction1 = () => {
    //     console.log("stuff" + this);
    // }
    // someArrowFunction1();

    // const someArrowFunction2 = () => console.log("stuff");
    // someArrowFunction2();

    // const itemFunction = item => <Item />

    // const itemListMapperFunction = data => {
    //     return data.map(item => <Item />)
    // }

    return (
        <div>
            {data.map(item => <Item key={item.id} item={item} />)}
            {/* {data.map(function(item) { return <Item /> })}
            {data.map(itemFunction)}
            {itemListMapperFunction} */}
        </div>
    )
}

export default ItemList;