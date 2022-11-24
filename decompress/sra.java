import android.view.MenuItem;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import com.twitter.ui.navigation.toolbar.fadeonscroll.FadeOnScrollToolbarBehavior$b;
import com.google.android.material.appbar.AppBarLayout;
import com.twitter.ui.navigation.toolbar.fadeonscroll.FadeOnScrollToolbarBehavior;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sra implements AppBarLayout$OnOffsetChangedListener
{
    public final FadeOnScrollToolbarBehavior a;
    
    public sra(final FadeOnScrollToolbarBehavior a) {
        this.a = a;
    }
    
    public final void onOffsetChanged(final AppBarLayout appBarLayout, int a) {
        final FadeOnScrollToolbarBehavior a2 = this.a;
        e0e.f((Object)a2, "this$0");
        e0e.f((Object)appBarLayout, "appBarLayout");
        FadeOnScrollToolbarBehavior$b c = a2.c;
        if (c != null) {
            if (((View)c.a()).getHeight() <= 0) {
                c = null;
            }
            if (c != null) {
                final View viewById = ((View)appBarLayout).findViewById(a2.a.a);
                int height;
                if (viewById != null) {
                    height = viewById.getHeight();
                }
                else {
                    height = 0;
                }
                final float a3 = cn1.Companion.a(Math.abs(a) / (float)(height - ((View)c.a()).getHeight()), 0.0f, 1.0f);
                final View viewById2 = ((View)appBarLayout).findViewById(a2.a.b);
                final Toolbar a4 = c.a();
                final ura f = a2.f;
                final int f2 = f.a.f;
                a2.e.b = a3;
                if (f.b.e) {
                    a = f.a();
                }
                else {
                    final wra c2 = f.c;
                    if (c2.b == c2.a.b) {
                        a = 1;
                    }
                    else {
                        a = 0;
                    }
                    if (a != 0) {
                        a = 255;
                    }
                    else {
                        a = 0;
                    }
                }
                if (a4 != null) {
                    ((View)a4).setBackgroundColor(js4.g(f2, a));
                }
                if (viewById2 != null) {
                    viewById2.setBackgroundColor(js4.g(f2, a2.f.a()));
                }
                if (a3 > a2.e.a()) {
                    ((View)c.a()).setVisibility(0);
                    if (((View)a4).getAlpha() < 1.0f) {
                        ((View)a4).setAlpha(a2.f.c.a());
                    }
                }
                if (a2.a.c) {
                    a4.setTitleTextColor(a2.f.b());
                }
                if (a2.a.d) {
                    a4.setSubtitleTextColor(a2.f.b());
                }
                final Drawable navigationIcon = a4.getNavigationIcon();
                if (navigationIcon != null) {
                    a2.t(navigationIcon);
                }
                final Drawable overflowIcon = a4.getOverflowIcon();
                if (overflowIcon != null) {
                    a2.t(overflowIcon);
                }
                if (a4.getMenu() != null) {
                    Menu menu;
                    MenuItem item;
                    Drawable icon;
                    Drawable e = null;
                    Drawable d;
                    for (a = a4.getMenu().size() - 1; -1 < a; --a) {
                        menu = a4.getMenu();
                        if (menu != null) {
                            item = menu.getItem(a);
                            if (item != null && item.getIcon() != null) {
                                icon = item.getIcon();
                                Label_0514: {
                                    if (icon != null) {
                                        e = ae9.e(icon);
                                        if (e != null) {
                                            d = ae9.d(e);
                                            e0e.e((Object)d, "unwrap<Drawable>(it)");
                                            a2.t(d);
                                            break Label_0514;
                                        }
                                    }
                                    e = null;
                                }
                                item.setIcon(e);
                            }
                        }
                    }
                }
            }
        }
    }
}
