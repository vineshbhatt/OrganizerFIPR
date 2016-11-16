package com.tcs.contentorganizer.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.contentorganizer.beans.FileShareBean;

public class FileShareRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rownum) throws SQLException {

		FileShareBean fileshare = new FileShareBean();

		if (rs.getString("fs_name") != null && !rs.getString("fs_name").trim().equals("")) {
			fileshare.setFileShareName(rs.getString("fs_name"));
		}

		if (rs.getString("fs_path") != null && !rs.getString("fs_path").trim().equals("")) {
			fileshare.setFileSharePath(rs.getString("fs_path"));
		}

		if (rs.getString("wf_status") != null && !rs.getString("wf_status").trim().equals("")) {
			fileshare.setFileShareStatus(rs.getString("wf_status"));
		}

		//TODO Add this column in the table and uncomment here
		
		if (rs.getString("fs_core") != null && !rs.getString("fs_core").trim().equals("")) {
			fileshare.setFileShareCoreName(rs.getString("fs_core"));
		}

		return fileshare;
	}

}
