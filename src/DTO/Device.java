package DTO;

/**
 * This DTO contains information about a device
 * This object contains device id, device name and device status (on/off)
 * and standard constructor, getters and setters
 */
public class Device extends ClientServerTransferObject{
    private int id;
    private String name;
    private byte status;

    /**
     * Constructor for a Device
     * @param id - int device id
     * @param name - String device name
     * @param status - byte device status: 0 - device off, 1 - device on
     */
    public Device(int id, String name, byte status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    /**
     * @return int device id
     */
    public int getId() {
        return id;
    }

    /**
     * Overwrites old id value with a new one
     * @param id - new int device id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String device name
     */
    public String getName() {
        return name;
    }

    /**
     * Overwrites old name value with a new one
     * @param name - new String device name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return byte device status (on/off)
     */
    public byte getStatus() {
        return status;
    }

    /**
     * Overwrites old status value with a new one
     * @param status - new byte device status (on/off)
     */
    public void setStatus(byte status) {
        this.status = status;
    }

    /**
     * @return String representation of this DTO
     */
    public String toString(){
        return "DeviceID : " + id + " Device Name: " + name + " Status: "  + status;
    }
}