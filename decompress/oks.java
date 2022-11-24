import android.view.ActionMode$Callback;
import android.view.View;
import android.view.ActionMode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oks
{
    public static final oks a;
    
    static {
        a = new oks();
    }
    
    public final void a(final ActionMode actionMode) {
        e0e.f((Object)actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }
    
    public final ActionMode b(final View view, final ActionMode$Callback actionMode$Callback, final int n) {
        e0e.f((Object)view, "view");
        e0e.f((Object)actionMode$Callback, "actionModeCallback");
        return view.startActionMode(actionMode$Callback, n);
    }
}
