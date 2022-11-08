// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.os.BaseBundle;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.ActivityNotFoundException;
import android.util.Log;
import java.util.Collection;
import android.view.KeyCharacterMap$KeyData;
import android.view.KeyEvent;
import java.util.Iterator;
import android.view.SubMenu;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.content.res.Resources;
import android.content.Context;

public class e implements qyr
{
    public static final int[] y;
    public final Context a;
    public final Resources b;
    public boolean c;
    public boolean d;
    public e.e$a e;
    public ArrayList<g> f;
    public ArrayList<g> g;
    public boolean h;
    public ArrayList<g> i;
    public ArrayList<g> j;
    public boolean k;
    public int l;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ArrayList<g> t;
    public CopyOnWriteArrayList<WeakReference<i>> u;
    public g v;
    public boolean w;
    public boolean x;
    
    static {
        y = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public e(final Context a) {
        final boolean b = false;
        this.l = 0;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = new ArrayList<g>();
        this.u = new CopyOnWriteArrayList<WeakReference<i>>();
        this.w = false;
        this.a = a;
        final Resources resources = a.getResources();
        this.b = resources;
        this.f = new ArrayList<g>();
        this.g = new ArrayList<g>();
        this.h = true;
        this.i = new ArrayList<g>();
        this.j = new ArrayList<g>();
        this.k = true;
        boolean d = b;
        if (resources.getConfiguration().keyboard != 1) {
            final ViewConfiguration value = ViewConfiguration.get(a);
            final Method a2 = a6x.a;
            boolean b2;
            if (Build$VERSION.SDK_INT >= 28) {
                b2 = a6x$b.b(value);
            }
            else {
                final Resources resources2 = a.getResources();
                final int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                b2 = (identifier != 0 && resources2.getBoolean(identifier));
            }
            d = b;
            if (b2) {
                d = true;
            }
        }
        this.d = d;
    }
    
    public final void A() {
        this.p = false;
        if (this.q) {
            this.q = false;
            this.r(this.r);
        }
    }
    
    public final void B() {
        if (!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }
    
    public final MenuItem a(int size, int n, final int n2, final CharSequence charSequence) {
        final int n3 = (0xFFFF0000 & n2) >> 16;
        if (n3 >= 0) {
            final int[] y = androidx.appcompat.view.menu.e.y;
            if (n3 < 6) {
                final int n4 = y[n3] << 16 | (0xFFFF & n2);
                final g g = new g(this, size, n, n2, n4, charSequence, this.l);
                final ArrayList<g> f = this.f;
                size = f.size();
                while (true) {
                    do {
                        n = size - 1;
                        if (n < 0) {
                            size = 0;
                            f.add(size, g);
                            this.r(true);
                            return (MenuItem)g;
                        }
                        size = n;
                    } while (((g)f.get(n)).d > n4);
                    size = n + 1;
                    continue;
                }
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }
    
    public final MenuItem add(final int n) {
        return this.a(0, 0, 0, this.b.getString(n));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.a(n, n2, n3, this.b.getString(n4));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.a(n, n2, n3, charSequence);
    }
    
    public final MenuItem add(final CharSequence charSequence) {
        return this.a(0, 0, 0, charSequence);
    }
    
    public final int addIntentOptions(final int n, final int n2, final int n3, final ComponentName componentName, final Intent[] array, final Intent intent, int n4, final MenuItem[] array2) {
        final PackageManager packageManager = this.a.getPackageManager();
        final int n5 = 0;
        final List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, array, intent, 0);
        int size;
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        }
        else {
            size = 0;
        }
        int i = n5;
        if ((n4 & 0x1) == 0x0) {
            this.removeGroup(n);
            i = n5;
        }
        while (i < size) {
            final ResolveInfo resolveInfo = queryIntentActivityOptions.get(i);
            n4 = resolveInfo.specificIndex;
            Intent intent2;
            if (n4 < 0) {
                intent2 = intent;
            }
            else {
                intent2 = array[n4];
            }
            final Intent intent3 = new Intent(intent2);
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            final MenuItem a = this.a(n, n2, n3, resolveInfo.loadLabel(packageManager));
            final Drawable loadIcon = resolveInfo.loadIcon(packageManager);
            final g g = (g)a;
            g.setIcon(loadIcon);
            ((MenuItem)g).setIntent(intent3);
            if (array2 != null) {
                n4 = resolveInfo.specificIndex;
                if (n4 >= 0) {
                    array2[n4] = (MenuItem)g;
                }
            }
            ++i;
        }
        return size;
    }
    
    public final SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, this.b.getString(n));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, this.b.getString(n4));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final g g = (g)this.a(n, n2, n3, charSequence);
        final l o = new l(this.a, this, g);
        (g.o = o).setHeaderTitle(g.e);
        return (SubMenu)o;
    }
    
    public final SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    public final void b(final i i) {
        this.c(i, this.a);
    }
    
    public final void c(final i i, final Context context) {
        this.u.add(new WeakReference<i>(i));
        i.h(context, this);
        this.k = true;
    }
    
    public final void clear() {
        final g v = this.v;
        if (v != null) {
            this.e(v);
        }
        this.f.clear();
        this.r(true);
    }
    
    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        this.r(false);
    }
    
    public final void close() {
        this.d(true);
    }
    
    public final void d(final boolean b) {
        if (this.s) {
            return;
        }
        this.s = true;
        for (final WeakReference weakReference : this.u) {
            final i i = (i)weakReference.get();
            if (i == null) {
                this.u.remove(weakReference);
            }
            else {
                i.a(this, b);
            }
        }
        this.s = false;
    }
    
    public boolean e(final g g) {
        final boolean empty = this.u.isEmpty();
        final boolean b = false;
        final int n = 0;
        boolean b2 = b;
        if (!empty) {
            if (this.v != g) {
                b2 = b;
            }
            else {
                this.B();
                final Iterator<WeakReference<i>> iterator = this.u.iterator();
                boolean c = n != 0;
                boolean b3;
                while (true) {
                    b3 = c;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final WeakReference weakReference = iterator.next();
                    final i i = (i)weakReference.get();
                    if (i == null) {
                        this.u.remove(weakReference);
                    }
                    else {
                        b3 = (c = i.c(g));
                        if (b3) {
                            break;
                        }
                        continue;
                    }
                }
                this.A();
                b2 = b3;
                if (b3) {
                    this.v = null;
                    b2 = b3;
                }
            }
        }
        return b2;
    }
    
    public boolean f(final e e, final MenuItem menuItem) {
        final e.e$a e2 = this.e;
        return e2 != null && e2.a(e, menuItem);
    }
    
    public final MenuItem findItem(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            final g g = this.f.get(i);
            if (g.a == n) {
                return (MenuItem)g;
            }
            if (g.hasSubMenu()) {
                final MenuItem item = ((e)g.o).findItem(n);
                if (item != null) {
                    return item;
                }
            }
        }
        return null;
    }
    
    public boolean g(final g v) {
        final boolean empty = this.u.isEmpty();
        boolean f = false;
        if (empty) {
            return false;
        }
        this.B();
        final Iterator<WeakReference<i>> iterator = this.u.iterator();
        boolean b;
        while (true) {
            b = f;
            if (!iterator.hasNext()) {
                break;
            }
            final WeakReference weakReference = iterator.next();
            final i i = (i)weakReference.get();
            if (i == null) {
                this.u.remove(weakReference);
            }
            else {
                b = (f = i.f(v));
                if (b) {
                    break;
                }
                continue;
            }
        }
        this.A();
        if (b) {
            this.v = v;
        }
        return b;
    }
    
    public final MenuItem getItem(final int n) {
        return (MenuItem)this.f.get(n);
    }
    
    public final g h(final int n, final KeyEvent keyEvent) {
        final ArrayList<g> t = this.t;
        t.clear();
        this.i(t, n, keyEvent);
        if (t.isEmpty()) {
            return null;
        }
        final int metaState = keyEvent.getMetaState();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        keyEvent.getKeyData(keyCharacterMap$KeyData);
        final int size = t.size();
        if (size == 1) {
            return (g)t.get(0);
        }
        final boolean o = this.o();
        for (int i = 0; i < size; ++i) {
            final g g = t.get(i);
            char c;
            if (o) {
                c = g.j;
            }
            else {
                c = g.h;
            }
            final char[] meta = keyCharacterMap$KeyData.meta;
            if ((c == meta[0] && (metaState & 0x2) == 0x0) || (c == meta[2] && (metaState & 0x2) != 0x0) || (o && c == '\b' && n == 67)) {
                return g;
            }
        }
        return null;
    }
    
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    public final void i(final List<g> list, final int n, final KeyEvent keyEvent) {
        final boolean o = this.o();
        final int modifiers = keyEvent.getModifiers();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        if (!keyEvent.getKeyData(keyCharacterMap$KeyData) && n != 67) {
            return;
        }
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final g g = this.f.get(i);
            if (g.hasSubMenu()) {
                ((e)g.o).i(list, n, keyEvent);
            }
            char c;
            if (o) {
                c = g.j;
            }
            else {
                c = g.h;
            }
            int n2;
            if (o) {
                n2 = g.k;
            }
            else {
                n2 = g.i;
            }
            if ((modifiers & 0x1100F) == (n2 & 0x1100F) && c != '\0') {
                final char[] meta = keyCharacterMap$KeyData.meta;
                if ((c == meta[0] || c == meta[2] || (o && c == '\b' && n == 67)) && g.isEnabled()) {
                    list.add(g);
                }
            }
        }
    }
    
    public final boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.h(n, keyEvent) != null;
    }
    
    public final void j() {
        final ArrayList<g> m = this.m();
        if (!this.k) {
            return;
        }
        final Iterator<WeakReference<i>> iterator = this.u.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final WeakReference weakReference = iterator.next();
            final i i = (i)weakReference.get();
            if (i == null) {
                this.u.remove(weakReference);
            }
            else {
                b |= i.g();
            }
        }
        if (b) {
            this.i.clear();
            this.j.clear();
            for (int size = m.size(), j = 0; j < size; ++j) {
                final g g = m.get(j);
                if (g.g()) {
                    this.i.add(g);
                }
                else {
                    this.j.add(g);
                }
            }
        }
        else {
            this.i.clear();
            this.j.clear();
            this.j.addAll(this.m());
        }
        this.k = false;
    }
    
    public String k() {
        return "android:menu:actionviewstates";
    }
    
    public e l() {
        return this;
    }
    
    public final ArrayList<g> m() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final g g = this.f.get(i);
            if (g.isVisible()) {
                this.g.add(g);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }
    
    public boolean n() {
        return this.w;
    }
    
    public boolean o() {
        return this.c;
    }
    
    public boolean p() {
        return this.d;
    }
    
    public final boolean performIdentifierAction(final int n, final int n2) {
        return this.t(this.findItem(n), null, n2);
    }
    
    public final boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final g h = this.h(n, keyEvent);
        final boolean b = h != null && this.t((MenuItem)h, null, n2);
        if ((n2 & 0x2) != 0x0) {
            this.d(true);
        }
        return b;
    }
    
    public final void q() {
        this.r(this.k = true);
    }
    
    public final void r(final boolean b) {
        if (!this.p) {
            if (b) {
                this.h = true;
                this.k = true;
            }
            if (!this.u.isEmpty()) {
                this.B();
                for (final WeakReference weakReference : this.u) {
                    final i i = (i)weakReference.get();
                    if (i == null) {
                        this.u.remove(weakReference);
                    }
                    else {
                        i.d();
                    }
                }
                this.A();
            }
        }
        else {
            this.q = true;
            if (b) {
                this.r = true;
            }
        }
    }
    
    public final void removeGroup(final int n) {
        while (true) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                if (this.f.get(i).b == n) {
                    if (i >= 0) {
                        for (int size2 = this.f.size(), n2 = 0; n2 < size2 - i && this.f.get(i).b == n; ++n2) {
                            this.u(i, false);
                        }
                        this.r(true);
                    }
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public final void removeItem(final int n) {
        while (true) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                if (this.f.get(i).a == n) {
                    this.u(i, true);
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public final boolean s(final MenuItem menuItem, final int n) {
        return this.t(menuItem, null, n);
    }
    
    public final void setGroupCheckable(final int n, final boolean checkable, final boolean b) {
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final g g = this.f.get(i);
            if (g.b == n) {
                final int x = g.x;
                int n2;
                if (b) {
                    n2 = 4;
                }
                else {
                    n2 = 0;
                }
                g.x = ((x & 0xFFFFFFFB) | n2);
                g.setCheckable(checkable);
            }
        }
    }
    
    public void setGroupDividerEnabled(final boolean w) {
        this.w = w;
    }
    
    public final void setGroupEnabled(final int n, final boolean enabled) {
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final g g = this.f.get(i);
            if (g.b == n) {
                g.setEnabled(enabled);
            }
        }
    }
    
    public final void setGroupVisible(final int n, final boolean b) {
        final int size = this.f.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final g g = this.f.get(i);
            int n3 = n2;
            if (g.b == n) {
                final int x = g.x;
                int n4;
                if (b) {
                    n4 = 0;
                }
                else {
                    n4 = 8;
                }
                final int x2 = (x & 0xFFFFFFF7) | n4;
                g.x = x2;
                final boolean b2 = x != x2;
                n3 = n2;
                if (b2) {
                    n3 = 1;
                }
            }
            ++i;
            n2 = n3;
        }
        if (n2 != 0) {
            this.r(true);
        }
    }
    
    public void setQwertyMode(final boolean c) {
        this.c = c;
        this.r(false);
    }
    
    public final int size() {
        return this.f.size();
    }
    
    public final boolean t(MenuItem menuItem, final i i, final int n) {
        menuItem = menuItem;
        int n2 = 0;
        int n3 = 0;
        if (menuItem != null && ((g)menuItem).isEnabled()) {
            final MenuItem$OnMenuItemClickListener p3 = ((g)menuItem).p;
            int n5 = 0;
            Label_0138: {
                Label_0067: {
                    if (p3 == null || !p3.onMenuItemClick(menuItem)) {
                        final e n4 = ((g)menuItem).n;
                        if (!n4.f(n4, menuItem)) {
                            final Intent g = ((g)menuItem).g;
                            if (g != null) {
                                try {
                                    ((g)menuItem).n.a.startActivity(g);
                                    break Label_0067;
                                }
                                catch (final ActivityNotFoundException ex) {
                                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)ex);
                                }
                            }
                            final bl a = ((g)menuItem).A;
                            if (a == null || !a.e()) {
                                n5 = 0;
                                break Label_0138;
                            }
                        }
                    }
                }
                n5 = 1;
            }
            final bl a2 = ((g)menuItem).A;
            final boolean b = a2 != null && a2.a();
            int n6;
            if (((g)menuItem).f()) {
                final boolean b2 = (n6 = (n5 | (((g)menuItem).expandActionView() ? 1 : 0))) != 0;
                if (b2) {
                    this.d(true);
                    n6 = (b2 ? 1 : 0);
                }
            }
            else if (!((g)menuItem).hasSubMenu() && !b) {
                n6 = n5;
                if ((n & 0x1) == 0x0) {
                    this.d(true);
                    n6 = n5;
                }
            }
            else {
                if ((n & 0x4) == 0x0) {
                    this.d(false);
                }
                if (!((g)menuItem).hasSubMenu()) {
                    (((g)menuItem).o = new l(this.a, this, (g)menuItem)).setHeaderTitle(((g)menuItem).e);
                }
                final l o = ((g)menuItem).o;
                if (b) {
                    a2.f((SubMenu)o);
                }
                if (!this.u.isEmpty()) {
                    if (i != null) {
                        n3 = (i.e(o) ? 1 : 0);
                    }
                    final Iterator<WeakReference<i>> iterator = this.u.iterator();
                    while (true) {
                        n2 = n3;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final WeakReference weakReference = iterator.next();
                        final i j = (i)weakReference.get();
                        if (j == null) {
                            this.u.remove(weakReference);
                        }
                        else {
                            if (n3 != 0) {
                                continue;
                            }
                            n3 = (j.e(o) ? 1 : 0);
                        }
                    }
                }
                final int n7 = n6 = (n5 | n2);
                if (n7 == 0) {
                    this.d(true);
                    n6 = n7;
                }
            }
            return n6 != 0;
        }
        return false;
    }
    
    public final void u(final int n, final boolean b) {
        if (n >= 0) {
            if (n < this.f.size()) {
                this.f.remove(n);
                if (b) {
                    this.r(true);
                }
            }
        }
    }
    
    public final void v(final i i) {
        for (final WeakReference weakReference : this.u) {
            final i j = (i)weakReference.get();
            if (j == null || j == i) {
                this.u.remove(weakReference);
            }
        }
    }
    
    public final void w(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(this.k());
        for (int size = this.size(), i = 0; i < size; ++i) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e)item.getSubMenu()).w(bundle);
            }
        }
        final int int1 = ((BaseBundle)bundle).getInt("android:menu:expandedactionview");
        if (int1 > 0) {
            final MenuItem item2 = this.findItem(int1);
            if (item2 != null) {
                item2.expandActionView();
            }
        }
    }
    
    public final void x(final Bundle bundle) {
        final int size = this.size();
        SparseArray sparseArray = null;
        SparseArray sparseArray2;
        for (int i = 0; i < size; ++i, sparseArray = sparseArray2) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            sparseArray2 = sparseArray;
            if (actionView != null) {
                sparseArray2 = sparseArray;
                if (actionView.getId() != -1) {
                    SparseArray sparseArray3;
                    if ((sparseArray3 = sparseArray) == null) {
                        sparseArray3 = new SparseArray();
                    }
                    actionView.saveHierarchyState(sparseArray3);
                    sparseArray2 = sparseArray3;
                    if (item.isActionViewExpanded()) {
                        ((BaseBundle)bundle).putInt("android:menu:expandedactionview", item.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (item.hasSubMenu()) {
                ((e)item.getSubMenu()).x(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.k(), sparseArray);
        }
    }
    
    public void y(final e.e$a e) {
        this.e = e;
    }
    
    public final void z(final int n, final CharSequence m, final int n2, final Drawable n3, final View o) {
        final Resources b = this.b;
        if (o != null) {
            this.o = o;
            this.m = null;
            this.n = null;
        }
        else {
            if (n > 0) {
                this.m = b.getText(n);
            }
            else if (m != null) {
                this.m = m;
            }
            if (n2 > 0) {
                final Context a = this.a;
                final Object a2 = eo6.a;
                this.n = eo6$c.b(a, n2);
            }
            else if (n3 != null) {
                this.n = n3;
            }
            this.o = null;
        }
        this.r(false);
    }
}
