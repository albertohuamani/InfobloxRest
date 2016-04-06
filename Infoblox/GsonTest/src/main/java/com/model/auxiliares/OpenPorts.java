package com.model.auxiliares;

public class OpenPorts {
	
	private String[] tcpports;
	private String[] udpports;
	
	
	public String[] getTcpports() {
		return tcpports;
	}
	public String[] getUdpports() {
		return udpports;
	}
	public OpenPorts(String ListaPuertos) {
		
		String tcp_ports="";
		String udp_ports="";
		
		if (ListaPuertos.length()<=4){
			//System.out.println("\tNo TCP/UDP válido");
			tcpports=null;
			udpports=null;
		}
		else
		{
			if (ListaPuertos.contains("TCP") && ListaPuertos.contains("UDP")){
				//System.out.println("\tTCP y UDP  OK");
				
				tcp_ports=ListaPuertos.substring(ListaPuertos.indexOf("TCP")+4, ListaPuertos.indexOf(" UDP"));
				udp_ports=ListaPuertos.substring(ListaPuertos.indexOf("UDP:")+4, ListaPuertos.length());
				
				tcpports = tcp_ports.split(",");
				//System.out.println(tcp_ports);
				udpports = udp_ports.split(",");
				//System.out.println(udp_ports);
			

			}
			else
			{
				if (ListaPuertos.contains("TCP")){
					
					//System.out.println("\tTCP OK");
					tcp_ports=ListaPuertos.substring(ListaPuertos.indexOf("TCP:")+4, ListaPuertos.length());
					tcpports = tcp_ports.split(",");
					}
				
				else{
					if (ListaPuertos.contains("UDP")){
						udp_ports=ListaPuertos.substring(ListaPuertos.indexOf("UDP:")+4, ListaPuertos.length());
						udpports = udp_ports.split(",");
					}
					else
					{
						tcpports=null;
						udpports=null;
					}
					
				}
				
				
			}
		}
		

	}
	
	
	
	


}
