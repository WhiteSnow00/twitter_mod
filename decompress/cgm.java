import android.view.RenderNode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgm
{
    public static final cgm a;
    
    static {
        a = new cgm();
    }
    
    public final int a(final RenderNode renderNode) {
        e0e.f((Object)renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }
    
    public final int b(final RenderNode renderNode) {
        e0e.f((Object)renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }
    
    public final void c(final RenderNode renderNode, final int ambientShadowColor) {
        e0e.f((Object)renderNode, "renderNode");
        renderNode.setAmbientShadowColor(ambientShadowColor);
    }
    
    public final void d(final RenderNode renderNode, final int spotShadowColor) {
        e0e.f((Object)renderNode, "renderNode");
        renderNode.setSpotShadowColor(spotShadowColor);
    }
}
