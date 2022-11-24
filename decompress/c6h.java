import android.view.KeyEvent;
import android.view.SubMenu;
import android.content.Intent;
import android.content.ComponentName;
import android.view.MenuItem;
import android.content.Context;
import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

public class c6h extends tn1 implements Menu
{
    public final e0s d;
    
    public c6h(final Context context, final e0s d) {
        super(context);
        if (d != null) {
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public final MenuItem add(final int n) {
        return this.d(((Menu)this.d).add(n));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.d(((Menu)this.d).add(n, n2, n3, n4));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.d(((Menu)this.d).add(n, n2, n3, charSequence));
    }
    
    public final MenuItem add(final CharSequence charSequence) {
        return this.d(((Menu)this.d).add(charSequence));
    }
    
    public final int addIntentOptions(int i, int length, int addIntentOptions, final ComponentName componentName, final Intent[] array, final Intent intent, final int n, final MenuItem[] array2) {
        MenuItem[] array3;
        if (array2 != null) {
            array3 = new MenuItem[array2.length];
        }
        else {
            array3 = null;
        }
        addIntentOptions = ((Menu)this.d).addIntentOptions(i, length, addIntentOptions, componentName, array, intent, n, array3);
        if (array3 != null) {
            for (i = 0, length = array3.length; i < length; ++i) {
                array2[i] = this.d(array3[i]);
            }
        }
        return addIntentOptions;
    }
    
    public final SubMenu addSubMenu(final int n) {
        return this.e(((Menu)this.d).addSubMenu(n));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.e(((Menu)this.d).addSubMenu(n, n2, n3, n4));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.e(((Menu)this.d).addSubMenu(n, n2, n3, charSequence));
    }
    
    public final SubMenu addSubMenu(final CharSequence charSequence) {
        return this.e(((Menu)this.d).addSubMenu(charSequence));
    }
    
    public final void clear() {
        final z8q z8q = (z8q)super.b;
        if (z8q != null) {
            z8q.clear();
        }
        final z8q z8q2 = (z8q)super.c;
        if (z8q2 != null) {
            z8q2.clear();
        }
        ((Menu)this.d).clear();
    }
    
    public final void close() {
        ((Menu)this.d).close();
    }
    
    public final MenuItem findItem(final int n) {
        return this.d(((Menu)this.d).findItem(n));
    }
    
    public final MenuItem getItem(final int n) {
        return this.d(((Menu)this.d).getItem(n));
    }
    
    public final boolean hasVisibleItems() {
        return ((Menu)this.d).hasVisibleItems();
    }
    
    public final boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return ((Menu)this.d).isShortcutKey(n, keyEvent);
    }
    
    public final boolean performIdentifierAction(final int n, final int n2) {
        return ((Menu)this.d).performIdentifierAction(n, n2);
    }
    
    public final boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        return ((Menu)this.d).performShortcut(n, keyEvent, n2);
    }
    
    public final void removeGroup(final int n) {
        if (super.b != null) {
            int n2 = 0;
            while (true) {
                final z8q z8q = (z8q)super.b;
                if (n2 >= z8q.H0) {
                    break;
                }
                int n3 = n2;
                if (((MenuItem)z8q.i(n2)).getGroupId() == n) {
                    ((z8q)super.b).j(n2);
                    n3 = n2 - 1;
                }
                n2 = n3 + 1;
            }
        }
        ((Menu)this.d).removeGroup(n);
    }
    
    public final void removeItem(final int n) {
        if (super.b != null) {
            int n2 = 0;
            while (true) {
                final z8q z8q = (z8q)super.b;
                if (n2 >= z8q.H0) {
                    break;
                }
                if (((MenuItem)z8q.i(n2)).getItemId() == n) {
                    ((z8q)super.b).j(n2);
                    break;
                }
                ++n2;
            }
        }
        ((Menu)this.d).removeItem(n);
    }
    
    public final void setGroupCheckable(final int n, final boolean b, final boolean b2) {
        ((Menu)this.d).setGroupCheckable(n, b, b2);
    }
    
    public final void setGroupEnabled(final int n, final boolean b) {
        ((Menu)this.d).setGroupEnabled(n, b);
    }
    
    public final void setGroupVisible(final int n, final boolean b) {
        ((Menu)this.d).setGroupVisible(n, b);
    }
    
    public final void setQwertyMode(final boolean qwertyMode) {
        ((Menu)this.d).setQwertyMode(qwertyMode);
    }
    
    public final int size() {
        return ((Menu)this.d).size();
    }
}
