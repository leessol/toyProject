package vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookEmpVO {
	private int us_seq;
	private String us_id;
	private String us_pw;
	private String us_name;
	private String us_ph;
	private Date reg_date;
	private char row_status;
}
