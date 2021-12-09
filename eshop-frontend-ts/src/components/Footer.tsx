class Props {
    name : String = ""
}

function Footer(props : Props) {
    return (
        <div>
            {props.name}
        </div>
    )
}

export default Footer;