/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE COLLISION PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Information about a potential collision
 */
public class msg_collision extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_COLLISION = 247;
    public static final int MAVLINK_MSG_LENGTH = 19;
    private static final long serialVersionUID = MAVLINK_MSG_ID_COLLISION;

    
    /**
     * Unique identifier, domain based on src field
     */
    @Description("Unique identifier, domain based on src field")
    @Units("")
    public long id;
    
    /**
     * Estimated time until collision occurs
     */
    @Description("Estimated time until collision occurs")
    @Units("s")
    public float time_to_minimum_delta;
    
    /**
     * Closest vertical distance between vehicle and object
     */
    @Description("Closest vertical distance between vehicle and object")
    @Units("m")
    public float altitude_minimum_delta;
    
    /**
     * Closest horizontal distance between vehicle and object
     */
    @Description("Closest horizontal distance between vehicle and object")
    @Units("m")
    public float horizontal_minimum_delta;
    
    /**
     * Collision data source
     */
    @Description("Collision data source")
    @Units("")
    public short src;
    
    /**
     * Action that is being taken to avoid this collision
     */
    @Description("Action that is being taken to avoid this collision")
    @Units("")
    public short action;
    
    /**
     * How concerned the aircraft is about this collision
     */
    @Description("How concerned the aircraft is about this collision")
    @Units("")
    public short threat_level;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_COLLISION;

        packet.payload.putUnsignedInt(id);
        packet.payload.putFloat(time_to_minimum_delta);
        packet.payload.putFloat(altitude_minimum_delta);
        packet.payload.putFloat(horizontal_minimum_delta);
        packet.payload.putUnsignedByte(src);
        packet.payload.putUnsignedByte(action);
        packet.payload.putUnsignedByte(threat_level);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a collision message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.id = payload.getUnsignedInt();
        this.time_to_minimum_delta = payload.getFloat();
        this.altitude_minimum_delta = payload.getFloat();
        this.horizontal_minimum_delta = payload.getFloat();
        this.src = payload.getUnsignedByte();
        this.action = payload.getUnsignedByte();
        this.threat_level = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_collision() {
        this.msgid = MAVLINK_MSG_ID_COLLISION;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_collision( long id, float time_to_minimum_delta, float altitude_minimum_delta, float horizontal_minimum_delta, short src, short action, short threat_level) {
        this.msgid = MAVLINK_MSG_ID_COLLISION;

        this.id = id;
        this.time_to_minimum_delta = time_to_minimum_delta;
        this.altitude_minimum_delta = altitude_minimum_delta;
        this.horizontal_minimum_delta = horizontal_minimum_delta;
        this.src = src;
        this.action = action;
        this.threat_level = threat_level;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_collision( long id, float time_to_minimum_delta, float altitude_minimum_delta, float horizontal_minimum_delta, short src, short action, short threat_level, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_COLLISION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.id = id;
        this.time_to_minimum_delta = time_to_minimum_delta;
        this.altitude_minimum_delta = altitude_minimum_delta;
        this.horizontal_minimum_delta = horizontal_minimum_delta;
        this.src = src;
        this.action = action;
        this.threat_level = threat_level;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_collision(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_COLLISION;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                  
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_COLLISION - sysid:"+sysid+" compid:"+compid+" id:"+id+" time_to_minimum_delta:"+time_to_minimum_delta+" altitude_minimum_delta:"+altitude_minimum_delta+" horizontal_minimum_delta:"+horizontal_minimum_delta+" src:"+src+" action:"+action+" threat_level:"+threat_level+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_COLLISION";
    }
}
        