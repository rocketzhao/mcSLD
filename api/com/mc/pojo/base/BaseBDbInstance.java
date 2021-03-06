package com.mc.pojo.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the b_db_instance table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="b_db_instance"
 */

public abstract class BaseBDbInstance  implements Serializable {

	public static String REF = "BDbInstance";
	public static String PROP_IP = "Ip";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_CONNECTION_USER_NAME = "ConnectionUserName";
	public static String PROP_CONNECTION_USER_PASSWORD = "ConnectionUserPassword";
	public static String PROP_LAST_CHANGED_ON = "LastChangedOn";
	public static String PROP_MONITOR_STATUS = "MonitorStatus";
	public static String PROP_DB_TYPE = "DbType";
	public static String PROP_NAME = "Name";
	public static String PROP_CREATED_BY = "CreatedBy";
	public static String PROP_CREATED_ON = "CreatedOn";
	public static String PROP_ID = "Id";
	public static String PROP_LAST_CHANGED_BY = "LastChangedBy";
	public static String PROP_DBC = "Dbc";
	public static String PROP_DB_VERSION = "DbVersion";


	// constructors
	public BaseBDbInstance () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBDbInstance (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseBDbInstance (
		java.lang.Integer id,
		com.mc.pojo.BDbCluster dbc) {

		this.setId(id);
		this.setDbc(dbc);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String name;
	private java.lang.String description;
	private java.lang.String monitorStatus;
	private java.lang.String ip;
	private java.lang.String dbType;
	private java.lang.String dbVersion;
	private java.lang.String connectionUserName;
	private java.lang.String connectionUserPassword;
	private java.lang.String createdBy;
	private java.lang.String createdOn;
	private java.lang.String lastChangedBy;
	private java.lang.String lastChangedOn;

	// many to one
	private com.mc.pojo.BDbCluster dbc;

	// collections
	private java.util.Set<com.mc.pojo.BTenant> bTenants;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="id"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: name
	 */
	public java.lang.String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: name
	 * @param name the name value
	 */
	public void setName (java.lang.String name) {
		this.name = name;
	}



	/**
	 * Return the value associated with the column: description
	 */
	public java.lang.String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
	 */
	public void setDescription (java.lang.String description) {
		this.description = description;
	}



	/**
	 * Return the value associated with the column: monitor_status
	 */
	public java.lang.String getMonitorStatus () {
		return monitorStatus;
	}

	/**
	 * Set the value related to the column: monitor_status
	 * @param monitorStatus the monitor_status value
	 */
	public void setMonitorStatus (java.lang.String monitorStatus) {
		this.monitorStatus = monitorStatus;
	}



	/**
	 * Return the value associated with the column: ip
	 */
	public java.lang.String getIp () {
		return ip;
	}

	/**
	 * Set the value related to the column: ip
	 * @param ip the ip value
	 */
	public void setIp (java.lang.String ip) {
		this.ip = ip;
	}



	/**
	 * Return the value associated with the column: db_type
	 */
	public java.lang.String getDbType () {
		return dbType;
	}

	/**
	 * Set the value related to the column: db_type
	 * @param dbType the db_type value
	 */
	public void setDbType (java.lang.String dbType) {
		this.dbType = dbType;
	}



	/**
	 * Return the value associated with the column: db_version
	 */
	public java.lang.String getDbVersion () {
		return dbVersion;
	}

	/**
	 * Set the value related to the column: db_version
	 * @param dbVersion the db_version value
	 */
	public void setDbVersion (java.lang.String dbVersion) {
		this.dbVersion = dbVersion;
	}



	/**
	 * Return the value associated with the column: connection_user_name
	 */
	public java.lang.String getConnectionUserName () {
		return connectionUserName;
	}

	/**
	 * Set the value related to the column: connection_user_name
	 * @param connectionUserName the connection_user_name value
	 */
	public void setConnectionUserName (java.lang.String connectionUserName) {
		this.connectionUserName = connectionUserName;
	}



	/**
	 * Return the value associated with the column: connection_user_password
	 */
	public java.lang.String getConnectionUserPassword () {
		return connectionUserPassword;
	}

	/**
	 * Set the value related to the column: connection_user_password
	 * @param connectionUserPassword the connection_user_password value
	 */
	public void setConnectionUserPassword (java.lang.String connectionUserPassword) {
		this.connectionUserPassword = connectionUserPassword;
	}



	/**
	 * Return the value associated with the column: created_by
	 */
	public java.lang.String getCreatedBy () {
		return createdBy;
	}

	/**
	 * Set the value related to the column: created_by
	 * @param createdBy the created_by value
	 */
	public void setCreatedBy (java.lang.String createdBy) {
		this.createdBy = createdBy;
	}



	/**
	 * Return the value associated with the column: created_on
	 */
	public java.lang.String getCreatedOn () {
		return createdOn;
	}

	/**
	 * Set the value related to the column: created_on
	 * @param createdOn the created_on value
	 */
	public void setCreatedOn (java.lang.String createdOn) {
		this.createdOn = createdOn;
	}



	/**
	 * Return the value associated with the column: last_changed_by
	 */
	public java.lang.String getLastChangedBy () {
		return lastChangedBy;
	}

	/**
	 * Set the value related to the column: last_changed_by
	 * @param lastChangedBy the last_changed_by value
	 */
	public void setLastChangedBy (java.lang.String lastChangedBy) {
		this.lastChangedBy = lastChangedBy;
	}



	/**
	 * Return the value associated with the column: last_changed_on
	 */
	public java.lang.String getLastChangedOn () {
		return lastChangedOn;
	}

	/**
	 * Set the value related to the column: last_changed_on
	 * @param lastChangedOn the last_changed_on value
	 */
	public void setLastChangedOn (java.lang.String lastChangedOn) {
		this.lastChangedOn = lastChangedOn;
	}



	/**
	 * Return the value associated with the column: dbc_id
	 */
	public com.mc.pojo.BDbCluster getDbc () {
		return dbc;
	}

	/**
	 * Set the value related to the column: dbc_id
	 * @param dbc the dbc_id value
	 */
	public void setDbc (com.mc.pojo.BDbCluster dbc) {
		this.dbc = dbc;
	}



	/**
	 * Return the value associated with the column: BTenants
	 */
	public java.util.Set<com.mc.pojo.BTenant> getBTenants () {
		return bTenants;
	}

	/**
	 * Set the value related to the column: BTenants
	 * @param bTenants the BTenants value
	 */
	public void setBTenants (java.util.Set<com.mc.pojo.BTenant> bTenants) {
		this.bTenants = bTenants;
	}

	public void addToBTenants (com.mc.pojo.BTenant bTenant) {
		if (null == getBTenants()) setBTenants(new java.util.TreeSet<com.mc.pojo.BTenant>());
		getBTenants().add(bTenant);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.mc.pojo.BDbInstance)) return false;
		else {
			com.mc.pojo.BDbInstance bDbInstance = (com.mc.pojo.BDbInstance) obj;
			if (null == this.getId() || null == bDbInstance.getId()) return false;
			else return (this.getId().equals(bDbInstance.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}