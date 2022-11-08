import android.view.RenderNode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vem
{
    public static final vem a;
    
    static {
        a = new vem();
    }
    
    public final void a(final RenderNode renderNode) {
        zzd.f((Object)renderNode, "renderNode");
        renderNode.destroyDisplayListData();
    }
}
