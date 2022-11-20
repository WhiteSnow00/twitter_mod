import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z42 extends hub implements qsb<View, z52>
{
    public z42(final Object o) {
        super(1, o, (Class)z52$a.class, "create", "create(Landroid/view/View;)Lcom/twitter/app/bookmarks/folders/BookmarkFolderViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "p0");
        return ((z52$a)((m93)this).receiver).a(view);
    }
}
