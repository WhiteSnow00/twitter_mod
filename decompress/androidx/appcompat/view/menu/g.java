// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import java.util.Objects;
import android.view.KeyEvent;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ViewDebug$CapturedViewProperty;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem$OnMenuItemClickListener;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.view.MenuItem$OnActionExpandListener;

public final class g implements syr
{
    public bl A;
    public MenuItem$OnActionExpandListener B;
    public boolean C;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public Drawable l;
    public int m;
    public e n;
    public l o;
    public MenuItem$OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public ColorStateList s;
    public PorterDuff$Mode t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public View z;
    
    public g(final e n, final int b, final int a, final int c, final int d, final CharSequence e, final int y) {
        this.i = 4096;
        this.k = 4096;
        this.m = 0;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 16;
        this.C = false;
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.y = y;
    }
    
    public static void c(final StringBuilder sb, final int n, final int n2, final String s) {
        if ((n & n2) == n2) {
            sb.append(s);
        }
    }
    
    public final syr a(bl a) {
        final bl a2 = this.A;
        if (a2 != null) {
            a2.a = null;
        }
        this.z = null;
        this.A = a;
        this.n.r(true);
        a = this.A;
        if (a != null) {
            a.h((bl$a)new bl$a() {});
        }
        return (syr)this;
    }
    
    public final bl b() {
        return this.A;
    }
    
    public final boolean collapseActionView() {
        if ((this.y & 0x8) == 0x0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        final MenuItem$OnActionExpandListener b = this.B;
        return (b == null || b.onMenuItemActionCollapse((MenuItem)this)) && this.n.e(this);
    }
    
    public final Drawable d(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.w) {
                if (!this.u) {
                    mutate = drawable;
                    if (!this.v) {
                        return mutate;
                    }
                }
                mutate = pd9.e(drawable).mutate();
                if (this.u) {
                    pd9.b.h(mutate, this.s);
                }
                if (this.v) {
                    pd9.b.i(mutate, this.t);
                }
                this.w = false;
            }
        }
        return mutate;
    }
    
    public final char e() {
        char c;
        if (this.n.o()) {
            c = this.j;
        }
        else {
            c = this.h;
        }
        return c;
    }
    
    public final boolean expandActionView() {
        if (!this.f()) {
            return false;
        }
        final MenuItem$OnActionExpandListener b = this.B;
        return (b == null || b.onMenuItemActionExpand((MenuItem)this)) && this.n.g(this);
    }
    
    public final boolean f() {
        final int y = this.y;
        boolean b = false;
        if ((y & 0x8) != 0x0) {
            if (this.z == null) {
                final bl a = this.A;
                if (a != null) {
                    this.z = a.d((MenuItem)this);
                }
            }
            b = b;
            if (this.z != null) {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean g() {
        return (this.x & 0x20) == 0x20;
    }
    
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }
    
    public final View getActionView() {
        final View z = this.z;
        if (z != null) {
            return z;
        }
        final bl a = this.A;
        if (a != null) {
            return this.z = a.d((MenuItem)this);
        }
        return null;
    }
    
    public final int getAlphabeticModifiers() {
        return this.k;
    }
    
    public final char getAlphabeticShortcut() {
        return this.j;
    }
    
    public final CharSequence getContentDescription() {
        return this.q;
    }
    
    public final int getGroupId() {
        return this.b;
    }
    
    public final Drawable getIcon() {
        final Drawable l = this.l;
        if (l != null) {
            return this.d(l);
        }
        final int m = this.m;
        if (m != 0) {
            final Drawable g = qli.g(this.n.a, m);
            this.m = 0;
            this.l = g;
            return this.d(g);
        }
        return null;
    }
    
    public final ColorStateList getIconTintList() {
        return this.s;
    }
    
    public final PorterDuff$Mode getIconTintMode() {
        return this.t;
    }
    
    public final Intent getIntent() {
        return this.g;
    }
    
    @ViewDebug$CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    public final int getNumericModifiers() {
        return this.i;
    }
    
    public final char getNumericShortcut() {
        return this.h;
    }
    
    public final int getOrder() {
        return this.c;
    }
    
    public final SubMenu getSubMenu() {
        return (SubMenu)this.o;
    }
    
    @ViewDebug$CapturedViewProperty
    public final CharSequence getTitle() {
        return this.e;
    }
    
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            charSequence = this.e;
        }
        return charSequence;
    }
    
    public final CharSequence getTooltipText() {
        return this.r;
    }
    
    public final boolean h() {
        return (this.x & 0x4) != 0x0;
    }
    
    public final boolean hasSubMenu() {
        return this.o != null;
    }
    
    public final syr i(final View z) {
        this.z = z;
        this.A = null;
        if (z != null && z.getId() == -1) {
            final int a = this.a;
            if (a > 0) {
                z.setId(a);
            }
        }
        this.n.q();
        return (syr)this;
    }
    
    public final boolean isActionViewExpanded() {
        return this.C;
    }
    
    public final boolean isCheckable() {
        final int x = this.x;
        boolean b = true;
        if ((x & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    public final boolean isChecked() {
        return (this.x & 0x2) == 0x2;
    }
    
    public final boolean isEnabled() {
        return (this.x & 0x10) != 0x0;
    }
    
    public final boolean isVisible() {
        final bl a = this.A;
        final boolean b = true;
        boolean b2 = true;
        if (a != null && a.g()) {
            if ((this.x & 0x8) != 0x0 || !this.A.b()) {
                b2 = false;
            }
            return b2;
        }
        return (this.x & 0x8) == 0x0 && b;
    }
    
    public final void j(final boolean b) {
        final int x = this.x;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        final int x2 = n | (x & 0xFFFFFFFD);
        this.x = x2;
        if (x != x2) {
            this.n.r(false);
        }
    }
    
    public final void k(final boolean b) {
        if (b) {
            this.x |= 0x20;
        }
        else {
            this.x &= 0xFFFFFFDF;
        }
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }
    
    public final MenuItem setActionView(final int n) {
        final Context a = this.n.a;
        this.i(LayoutInflater.from(a).inflate(n, (ViewGroup)new LinearLayout(a), false));
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char c) {
        if (this.j == c) {
            return (MenuItem)this;
        }
        this.j = Character.toLowerCase(c);
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        if (this.j == c && this.k == n) {
            return (MenuItem)this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(n);
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean b) {
        final int x = this.x;
        final int x2 = (b ? 1 : 0) | (x & 0xFFFFFFFE);
        this.x = x2;
        if (x != x2) {
            this.n.r(false);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean b) {
        if ((this.x & 0x4) != 0x0) {
            final e n = this.n;
            Objects.requireNonNull(n);
            final int groupId = this.getGroupId();
            final int size = n.f.size();
            n.B();
            for (int i = 0; i < size; ++i) {
                final g g = n.f.get(i);
                if (g.b == groupId) {
                    if (g.h()) {
                        if (g.isCheckable()) {
                            g.j(g == this);
                        }
                    }
                }
            }
            n.A();
        }
        else {
            this.j(b);
        }
        return (MenuItem)this;
    }
    
    public final syr setContentDescription(final CharSequence q) {
        this.q = q;
        this.n.r(false);
        return (syr)this;
    }
    
    public final MenuItem setEnabled(final boolean b) {
        if (b) {
            this.x |= 0x10;
        }
        else {
            this.x &= 0xFFFFFFEF;
        }
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int m) {
        this.l = null;
        this.m = m;
        this.w = true;
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable l) {
        this.m = 0;
        this.l = l;
        this.w = true;
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintList(final ColorStateList s) {
        this.s = s;
        this.u = true;
        this.w = true;
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintMode(final PorterDuff$Mode t) {
        this.t = t;
        this.v = true;
        this.w = true;
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent g) {
        this.g = g;
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c) {
        if (this.h == c) {
            return (MenuItem)this;
        }
        this.h = c;
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c, final int n) {
        if (this.h == c && this.i == n) {
            return (MenuItem)this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(n);
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener b) {
        this.B = b;
        return (MenuItem)this;
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener p) {
        this.p = p;
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(n);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(n2);
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final void setShowAsAction(final int y) {
        final int n = y & 0x3;
        if (n != 0 && n != 1 && n != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = y;
        this.n.q();
    }
    
    public final MenuItem setShowAsActionFlags(final int showAsAction) {
        this.setShowAsAction(showAsAction);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final int n) {
        this.setTitle(this.n.a.getString(n));
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence charSequence) {
        this.e = charSequence;
        this.n.r(false);
        final l o = this.o;
        if (o != null) {
            o.setHeaderTitle(charSequence);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence f) {
        this.f = f;
        this.n.r(false);
        return (MenuItem)this;
    }
    
    public final syr setTooltipText(final CharSequence r) {
        this.r = r;
        this.n.r(false);
        return (syr)this;
    }
    
    public final MenuItem setVisible(final boolean b) {
        final int x = this.x;
        final int n = 0;
        int n2;
        if (b) {
            n2 = 0;
        }
        else {
            n2 = 8;
        }
        final int x2 = n2 | (x & 0xFFFFFFF7);
        this.x = x2;
        int n3 = n;
        if (x != x2) {
            n3 = 1;
        }
        if (n3 != 0) {
            final e n4 = this.n;
            n4.r(n4.h = true);
        }
        return (MenuItem)this;
    }
    
    @Override
    public final String toString() {
        final CharSequence e = this.e;
        String string;
        if (e != null) {
            string = e.toString();
        }
        else {
            string = null;
        }
        return string;
    }
}
