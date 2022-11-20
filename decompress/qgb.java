import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qgb extends hub implements qsb<View, ogb>
{
    public qgb(final Object o) {
        super(1, o, (Class)ogb$b.class, "create", "create(Landroid/view/View;)Lcom/twitter/app/bookmarks/folders/folder/FolderTimelineViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((ogb$b)((m93)this).receiver).a(view);
    }
}
