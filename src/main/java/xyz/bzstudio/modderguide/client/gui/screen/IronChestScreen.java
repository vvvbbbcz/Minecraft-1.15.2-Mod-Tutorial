package xyz.bzstudio.modderguide.client.gui.screen;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;

public class IronChestScreen extends Screen {
	private TextFieldWidget textFieldWidget;
	public IronChestScreen() {
		super(new StringTextComponent("iron_chest"));
	}

	@Override
	protected void init() {
		this.addButton(new Button(this.width / 8, this.height / 8, 50, 20, "关闭", (press) -> {
			this.getMinecraft().displayGuiScreen(null);
		}));

		this.textFieldWidget = new TextFieldWidget(this.font, this.width / 4 - 75, this.height / 4, 150, 30, "搜索");
		this.children.add(this.textFieldWidget);
	}

	@Override
	public void render(int p_render_1_, int p_render_2_, float p_render_3_) {
		super.render(p_render_1_, p_render_2_, p_render_3_);
		this.renderBackground();
		this.textFieldWidget.render(p_render_1_, p_render_2_, p_render_3_);
	}

	@Override
	public boolean isPauseScreen() {
		return false;
	}
}
