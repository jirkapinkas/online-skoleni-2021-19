import Item from "./Item";

function ItemList() {
    const data = [
        {
            id : 1,
            name : "first",
            price : 123
        },
        {
            id : 2,
            name : "second",
            price : 321
        }
    ];
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