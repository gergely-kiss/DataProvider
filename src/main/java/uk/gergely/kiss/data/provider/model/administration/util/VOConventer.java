package uk.gergely.kiss.data.provider.model.administration.util;

public interface VOConventer<InputVO, Converted> {
	public Converted converted(InputVO inputVO);
}
