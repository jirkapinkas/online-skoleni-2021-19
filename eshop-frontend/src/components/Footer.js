import './Footer.css'

function Footer(props) {
    return (
        <div className="Footer_footer">
            <div>(C) Skoleni Java</div>
            <div>{props.fromDate} - {props.toDate}</div>
        </div>
    )
}

export default Footer;