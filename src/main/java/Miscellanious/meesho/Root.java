package Miscellanious.meesho;

public class Root {
    public Metadata metadata;
    public Data data;
}

class Metadata {
    public String request_id;
    public String service_identifier;
    public String timestamp;
}

class Data {
    public String type;
    public String awb;
    public String carrier;
    public String carrier_account_type;
    public String status;
    public String status_code;
    public String status_time;
    public String remarks;
    public String location;
    public String meesho_status;
    public Additional_fields additional_fields;
}

class Additional_fields {
    public Delhivery delhivery;
}

class Delhivery {
    public String status_direction;
}


// Sample Json
/*
{
  "metadata": {
    "request_id": "123221312312542",
    "service_identifier": "OPP",
    "timestamp": "1558598901000"
  },
  "data": {
    "type": "forward",
    "awb": "CC10032756",
    "carrier": "ecom",
    "carrier_account_type": "domestic_surface",
    "status": "300",
    "status_code": "300",
    "status_time": "2021-06-16 12:13:01",
    "remarks": "202",
    "location": "Delhi",
    "meesho_status": "6",
    "additional_fields": {
      "delhivery": {
        "status_direction": "LT"
      }
    }
  }
}
 */
