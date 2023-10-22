package hr.kingict.springbootakademija2023_2.dto;

public class FlightSearchDto {

    // outbound data
    private String outboundDepartureAirport;
    private String outboundDepartureDate;
    private String outboundArrivalAirport;
    private String outboundArrivalDate;

    //inbound data
    private String inboundDepartureAirport;
    private String inboundDepartureDate;
    private String inboundArrivalAirport;
    private String inboundArrivalDate;

    private String price;
    private String outboundCarrier;
    private String inboundCarrier;

    public String getOutboundDepartureAirport() {
        return outboundDepartureAirport;
    }

    public void setOutboundDepartureAirport(String outboundDepartureAirport) {
        this.outboundDepartureAirport = outboundDepartureAirport;
    }

    public String getOutboundDepartureDate() {
        return outboundDepartureDate;
    }

    public void setOutboundDepartureDate(String outboundDepartureDate) {
        this.outboundDepartureDate = outboundDepartureDate;
    }

    public String getOutboundArrivalAirport() {
        return outboundArrivalAirport;
    }

    public void setOutboundArrivalAirport(String outboundArrivalAirport) {
        this.outboundArrivalAirport = outboundArrivalAirport;
    }

    public String getOutboundArrivalDate() {
        return outboundArrivalDate;
    }

    public void setOutboundArrivalDate(String outboundArrivalDate) {
        this.outboundArrivalDate = outboundArrivalDate;
    }

    public String getInboundDepartureAirport() {
        return inboundDepartureAirport;
    }

    public void setInboundDepartureAirport(String inboundDepartureAirport) {
        this.inboundDepartureAirport = inboundDepartureAirport;
    }

    public String getInboundDepartureDate() {
        return inboundDepartureDate;
    }

    public void setInboundDepartureDate(String inboundDepartureDate) {
        this.inboundDepartureDate = inboundDepartureDate;
    }

    public String getInboundArrivalAirport() {
        return inboundArrivalAirport;
    }

    public void setInboundArrivalAirport(String inboundArrivalAirport) {
        this.inboundArrivalAirport = inboundArrivalAirport;
    }

    public String getInboundArrivalDate() {
        return inboundArrivalDate;
    }

    public void setInboundArrivalDate(String inboundArrivalDate) {
        this.inboundArrivalDate = inboundArrivalDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;

    }
    public String getOutboundCarrier() {
        return outboundCarrier;
    }

    public void setOutboundCarrier(String outboundCarrier) {
        this.outboundCarrier = outboundCarrier;
    }

    public String getInboundCarrier() {
        return inboundCarrier;
    }

    public void setInboundCarrier(String inboundCarrier) {
        this.inboundCarrier = inboundCarrier;
    }
}
