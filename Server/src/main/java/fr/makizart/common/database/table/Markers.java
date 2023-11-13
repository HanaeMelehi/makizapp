package fr.makizart.common.database.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.net.URI;

@Entity
@Table(name = "MARKER")
public class Markers extends Media{

	@Column(name="PATH", nullable=false)
	private URI marker1Path;

	@Column(name="PATH", nullable=false)
	private URI marker2Path;
	@Column(name="PATH", nullable=false)
	private URI marker3Path;

	public URI getMarker1Path() {
		return marker1Path;
	}

	public void setMarker1Path(URI marker1Path) {
		this.marker1Path = marker1Path;
	}

	public URI getMarker2Path() {
		return marker2Path;
	}

	public void setMarker2Path(URI marker2Path) {
		this.marker2Path = marker2Path;
	}

	public URI getMarker3Path() {
		return marker3Path;
	}

	public void setMarker3Path(URI marker3Path) {
		this.marker3Path = marker3Path;
	}
}
