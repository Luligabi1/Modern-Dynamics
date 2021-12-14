package dev.technici4n.moderndynamics.attachment;

public class IoAttachmentItem extends ConfigurableAttachmentItem {
	public final AttachmentTier tier;
	private final boolean servo;

	public IoAttachmentItem(RenderedAttachment attachment, AttachmentTier tier, boolean servo) {
		super(attachment, tier.configWidth, tier.configHeight);
		this.tier = tier;
		this.servo = servo;
	}

	public boolean isServo() {
		return servo;
	}

	public boolean isRetriever() {
		return !servo;
	}
}