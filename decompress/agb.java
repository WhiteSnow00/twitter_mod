import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agb extends hub implements qsb<View, xfb>
{
    public agb(final Object o) {
        super(1, o, (Class)xfb$a.class, "create", "create(Landroid/view/View;)Lcom/twitter/app/bookmarks/folders/empty/FolderEmptyViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((xfb$a)((m93)this).receiver).a(view);
    }
}
