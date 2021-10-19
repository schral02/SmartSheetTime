
import com.smartsheet.api.Smartsheet;
import com.smartsheet.api.SmartsheetFactory;
import com.smartsheet.api.models.Cell;
import com.smartsheet.api.models.Column;
import com.smartsheet.api.models.Folder;
import com.smartsheet.api.models.PagedResult;
import com.smartsheet.api.models.Row;
import com.smartsheet.api.models.Sheet;


import java.time.*;
import java.time.temporal.ChronoUnit;

public class Timekeeper {

	double period;
	LocalDate start;
	String category;
	String item;
	String assignedTo;
	String status;
	
	public Timekeeper(double period, LocalDate start, String category, String item, String assignedTo, String status) {
		this.period = period;
		this.start = start;
		this.category = category;
		this.item = item;
		this.assignedTo = assignedTo;
		this.status = status;
		
	}
	
	public boolean checkTime() {
		
		// get current time
		LocalDate cur = LocalDate.now();
		
		long val = ChronoUnit.DAYS.between(start, cur);
		
		
		if (val % period == 0)
			return true;
		
		return false;
	}
}
