import android.graphics.Rect;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ActionMode;
import android.view.ActionMode$Callback2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c8b extends ActionMode$Callback2
{
    public final dfs a;
    
    public c8b(final dfs a) {
        e0e.f((Object)a, "callback");
        this.a = a;
    }
    
    public final boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        return this.a.c(actionMode, menuItem);
    }
    
    public final boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        this.a.d(actionMode, menu);
        return true;
    }
    
    public final void onDestroyActionMode(final ActionMode actionMode) {
        final ptb a = this.a.a;
        if (a != null) {
            a.invoke();
        }
    }
    
    public final void onGetContentRect(final ActionMode actionMode, final View view, final Rect rect) {
        final p6m b = this.a.b;
        if (rect != null) {
            rect.set((int)b.a, (int)b.b, (int)b.c, (int)b.d);
        }
    }
    
    public final boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        return this.a.e(actionMode, menu);
    }
}
