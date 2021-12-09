function Item({item}) {
    // NEBO mit jako vstup props a pak se da pouzivat props.name, props.price
    // console.log(props.item)
    // obecne object destructuring:
    // let {name, price} = props;
    return (
        <div>
            name:
            <span>{item.name}</span>
            &nbsp;
            price:
            <span>{item.price}</span>
        </div>
    )
}

export default Item;