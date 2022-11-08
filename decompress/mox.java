import android.view.ActionMode$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.SearchEvent;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public class mox implements Window$Callback
{
    public final Window$Callback C0;
    
    public mox(final Window$Callback c0) {
        if (c0 != null) {
            this.C0 = c0;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.C0.dispatchGenericMotionEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.C0.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.C0.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.C0.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.C0.dispatchTouchEvent(motionEvent);
    }
    
    public final boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.C0.dispatchTrackballEvent(motionEvent);
    }
    
    public final void onActionModeFinished(final ActionMode actionMode) {
        this.C0.onActionModeFinished(actionMode);
    }
    
    public final void onActionModeStarted(final ActionMode actionMode) {
        this.C0.onActionModeStarted(actionMode);
    }
    
    public final void onAttachedToWindow() {
        this.C0.onAttachedToWindow();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return this.C0.onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return this.C0.onCreatePanelView(n);
    }
    
    public final void onDetachedFromWindow() {
        this.C0.onDetachedFromWindow();
    }
    
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.C0.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.C0.onMenuOpened(n, menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        this.C0.onPanelClosed(n, menu);
    }
    
    public final void onPointerCaptureChanged(final boolean b) {
        c.a(this.C0, b);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return this.C0.onPreparePanel(n, view, menu);
    }
    
    public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
        b.a(this.C0, list, menu, n);
    }
    
    public final boolean onSearchRequested() {
        return this.C0.onSearchRequested();
    }
    
    public final boolean onSearchRequested(final SearchEvent searchEvent) {
        return a.a(this.C0, searchEvent);
    }
    
    public final void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.C0.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        this.C0.onWindowFocusChanged(b);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.C0.onWindowStartingActionMode(actionMode$Callback);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
        return a.b(this.C0, actionMode$Callback, n);
    }
    
    public static final class a
    {
        public static boolean a(final Window$Callback window$Callback, final SearchEvent searchEvent) {
            return window$Callback.onSearchRequested(searchEvent);
        }
        
        public static ActionMode b(final Window$Callback window$Callback, final ActionMode$Callback actionMode$Callback, final int n) {
            return window$Callback.onWindowStartingActionMode(actionMode$Callback, n);
        }
    }
    
    public static final class b
    {
        public static void a(final Window$Callback window$Callback, final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
            window$Callback.onProvideKeyboardShortcuts((List)list, menu, n);
        }
    }
    
    public static final class c
    {
        public static void a(final Window$Callback window$Callback, final boolean b) {
            window$Callback.onPointerCaptureChanged(b);
        }
    }
}
