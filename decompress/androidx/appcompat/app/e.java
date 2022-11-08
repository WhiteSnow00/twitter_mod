// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.widget.ListView;
import android.widget.AbsListView;
import android.widget.LinearLayout$LayoutParams;
import android.app.Dialog;
import android.view.KeyEvent;
import android.widget.ListAdapter;
import java.util.WeakHashMap;
import android.widget.AbsListView$OnScrollListener;
import android.os.Build$VERSION;
import java.util.Objects;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.appcompat.widget.LinearLayoutCompat$a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.util.TypedValue;
import android.content.Context;

public final class e extends gk0
{
    public final AlertController G0;
    
    public e(final Context context, final int n) {
        super(context, k(context, n));
        this.G0 = new AlertController(((Dialog)this).getContext(), (gk0)this, ((Dialog)this).getWindow());
    }
    
    public static int k(final Context context, final int n) {
        if ((n >>> 24 & 0xFF) >= 1) {
            return n;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968661, typedValue, true);
        return typedValue.resourceId;
    }
    
    @Override
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final AlertController g0 = this.G0;
        int contentView;
        if (g0.G == 0) {
            contentView = g0.F;
        }
        else {
            contentView = g0.F;
        }
        g0.b.setContentView(contentView);
        final View viewById = g0.c.findViewById(2131430506);
        final View viewById2 = viewById.findViewById(2131432131);
        final View viewById3 = viewById.findViewById(2131428433);
        final View viewById4 = viewById.findViewById(2131427976);
        final ViewGroup viewGroup = (ViewGroup)viewById.findViewById(2131428561);
        View view = g0.h;
        View view2 = null;
        final int n = 0;
        if (view == null) {
            if (g0.i != 0) {
                view = LayoutInflater.from(g0.a).inflate(g0.i, viewGroup, false);
            }
            else {
                view = null;
            }
        }
        final boolean b = view != null;
        if (!b || !AlertController.a(view)) {
            g0.c.setFlags(131072, 131072);
        }
        if (b) {
            final FrameLayout frameLayout = (FrameLayout)g0.c.findViewById(2131428560);
            ((ViewGroup)frameLayout).addView(view, new ViewGroup$LayoutParams(-1, -1));
            if (g0.j) {
                ((View)frameLayout).setPadding(0, 0, 0, 0);
            }
            if (g0.g != null) {
                ((LinearLayout$LayoutParams)((View)viewGroup).getLayoutParams()).weight = 0.0f;
            }
        }
        else {
            ((View)viewGroup).setVisibility(8);
        }
        final View viewById5 = ((View)viewGroup).findViewById(2131432131);
        final View viewById6 = ((View)viewGroup).findViewById(2131428433);
        final View viewById7 = ((View)viewGroup).findViewById(2131427976);
        final ViewGroup d = g0.d(viewById5, viewById2);
        final ViewGroup d2 = g0.d(viewById6, viewById3);
        final ViewGroup d3 = g0.d(viewById7, viewById4);
        ((View)(g0.w = (NestedScrollView)g0.c.findViewById(2131431240))).setFocusable(false);
        g0.w.setNestedScrollingEnabled(false);
        final TextView b2 = (TextView)((View)d2).findViewById(16908299);
        if ((g0.B = b2) != null) {
            final CharSequence f = g0.f;
            if (f != null) {
                b2.setText(f);
            }
            else {
                ((View)b2).setVisibility(8);
                ((ViewGroup)g0.w).removeView((View)g0.B);
                if (g0.g != null) {
                    final ViewGroup viewGroup2 = (ViewGroup)((View)g0.w).getParent();
                    final int indexOfChild = viewGroup2.indexOfChild((View)g0.w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView((View)g0.g, indexOfChild, new ViewGroup$LayoutParams(-1, -1));
                }
                else {
                    ((View)d2).setVisibility(8);
                }
            }
        }
        ((View)(g0.k = (Button)((View)d3).findViewById(16908313))).setOnClickListener((View$OnClickListener)g0.N);
        int n2;
        if (TextUtils.isEmpty(g0.l) && g0.n == null) {
            ((View)g0.k).setVisibility(8);
            n2 = 0;
        }
        else {
            ((TextView)g0.k).setText(g0.l);
            final Drawable n3 = g0.n;
            if (n3 != null) {
                final int d4 = g0.d;
                n3.setBounds(0, 0, d4, d4);
                ((TextView)g0.k).setCompoundDrawables(g0.n, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            ((View)g0.k).setVisibility(0);
            n2 = 1;
        }
        ((View)(g0.o = (Button)((View)d3).findViewById(16908314))).setOnClickListener((View$OnClickListener)g0.N);
        if (TextUtils.isEmpty(g0.p) && g0.r == null) {
            ((View)g0.o).setVisibility(8);
        }
        else {
            ((TextView)g0.o).setText(g0.p);
            final Drawable r = g0.r;
            if (r != null) {
                final int d5 = g0.d;
                r.setBounds(0, 0, d5, d5);
                ((TextView)g0.o).setCompoundDrawables(g0.r, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            ((View)g0.o).setVisibility(0);
            n2 |= 0x2;
        }
        ((View)(g0.s = (Button)((View)d3).findViewById(16908315))).setOnClickListener((View$OnClickListener)g0.N);
        if (TextUtils.isEmpty(g0.t) && g0.v == null) {
            ((View)g0.s).setVisibility(8);
        }
        else {
            ((TextView)g0.s).setText(g0.t);
            final Drawable v = g0.v;
            if (v != null) {
                final int d6 = g0.d;
                v.setBounds(0, 0, d6, d6);
                ((TextView)g0.s).setCompoundDrawables(g0.v, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            ((View)g0.s).setVisibility(0);
            n2 |= 0x4;
        }
        final Context a = g0.a;
        final TypedValue typedValue = new TypedValue();
        a.getTheme().resolveAttribute(2130968659, typedValue, true);
        if (typedValue.data != 0) {
            if (n2 == 1) {
                g0.b(g0.k);
            }
            else if (n2 == 2) {
                g0.b(g0.o);
            }
            else if (n2 == 4) {
                g0.b(g0.s);
            }
        }
        if (n2 == 0) {
            ((View)d3).setVisibility(8);
        }
        if (g0.C != null) {
            d.addView(g0.C, 0, new ViewGroup$LayoutParams(-1, -2));
            g0.c.findViewById(2131432087).setVisibility(8);
        }
        else {
            g0.z = (ImageView)g0.c.findViewById(16908294);
            if ((TextUtils.isEmpty(g0.e) ^ true) && g0.L) {
                (g0.A = (TextView)g0.c.findViewById(2131427580)).setText(g0.e);
                final int x = g0.x;
                if (x != 0) {
                    g0.z.setImageResource(x);
                }
                else {
                    final Drawable y = g0.y;
                    if (y != null) {
                        g0.z.setImageDrawable(y);
                    }
                    else {
                        g0.A.setPadding(((View)g0.z).getPaddingLeft(), ((View)g0.z).getPaddingTop(), ((View)g0.z).getPaddingRight(), ((View)g0.z).getPaddingBottom());
                        g0.z.setVisibility(8);
                    }
                }
            }
            else {
                g0.c.findViewById(2131432087).setVisibility(8);
                g0.z.setVisibility(8);
                ((View)d).setVisibility(8);
            }
        }
        final boolean b3 = ((View)viewGroup).getVisibility() != 8;
        int n4;
        if (d != null && ((View)d).getVisibility() != 8) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        final boolean b4 = ((View)d3).getVisibility() != 8;
        if (!b4) {
            final View viewById8 = ((View)d2).findViewById(2131431943);
            if (viewById8 != null) {
                viewById8.setVisibility(0);
            }
        }
        if (n4 != 0) {
            final NestedScrollView w = g0.w;
            if (w != null) {
                ((ViewGroup)w).setClipToPadding(true);
            }
            View viewById9;
            if (g0.f == null && g0.g == null) {
                viewById9 = null;
            }
            else {
                viewById9 = ((View)d).findViewById(2131432074);
            }
            if (viewById9 != null) {
                viewById9.setVisibility(0);
            }
        }
        else {
            final View viewById10 = ((View)d2).findViewById(2131431944);
            if (viewById10 != null) {
                viewById10.setVisibility(0);
            }
        }
        final AlertController$RecycleListView g2 = g0.g;
        if (g2 instanceof AlertController$RecycleListView) {
            Objects.requireNonNull(g2);
            if (!b4 || n4 == 0) {
                final int paddingLeft = ((View)g2).getPaddingLeft();
                int n5;
                if (n4 != 0) {
                    n5 = ((View)g2).getPaddingTop();
                }
                else {
                    n5 = g2.C0;
                }
                final int paddingRight = ((View)g2).getPaddingRight();
                int n6;
                if (b4) {
                    n6 = ((View)g2).getPaddingBottom();
                }
                else {
                    n6 = g2.D0;
                }
                ((View)g2).setPadding(paddingLeft, n5, paddingRight, n6);
            }
        }
        if (!b3) {
            Object o = g0.g;
            if (o == null) {
                o = g0.w;
            }
            if (o != null) {
                int n7 = n;
                if (b4) {
                    n7 = 2;
                }
                final int n8 = n4 | n7;
                final View viewById11 = g0.c.findViewById(2131431239);
                final View viewById12 = g0.c.findViewById(2131431238);
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 23) {
                    final WeakHashMap a2 = p5x.a;
                    if (sdk_INT >= 23) {
                        p5x$j.d((View)o, n8, 3);
                    }
                    if (viewById11 != null) {
                        d2.removeView(viewById11);
                    }
                    if (viewById12 != null) {
                        d2.removeView(viewById12);
                    }
                }
                else {
                    View view3;
                    if ((view3 = viewById11) != null) {
                        view3 = viewById11;
                        if ((n8 & 0x1) == 0x0) {
                            d2.removeView(viewById11);
                            view3 = null;
                        }
                    }
                    if (viewById12 != null && (n8 & 0x2) == 0x0) {
                        d2.removeView(viewById12);
                    }
                    else {
                        view2 = viewById12;
                    }
                    if (view3 != null || view2 != null) {
                        if (g0.f != null) {
                            g0.w.setOnScrollChangeListener((NestedScrollView.c)new iw(view3, view2));
                            ((View)g0.w).post((Runnable)new jw(g0, view3, view2));
                        }
                        else {
                            final AlertController$RecycleListView g3 = g0.g;
                            if (g3 != null) {
                                ((AbsListView)g3).setOnScrollListener((AbsListView$OnScrollListener)new kw(view3, view2));
                                ((View)g0.g).post((Runnable)new lw(g0, view3, view2));
                            }
                            else {
                                if (view3 != null) {
                                    d2.removeView(view3);
                                }
                                if (view2 != null) {
                                    d2.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        final AlertController$RecycleListView g4 = g0.g;
        if (g4 != null) {
            final ListAdapter d7 = g0.D;
            if (d7 != null) {
                ((ListView)g4).setAdapter(d7);
                final int e = g0.E;
                if (e > -1) {
                    ((AbsListView)g4).setItemChecked(e, true);
                    ((ListView)g4).setSelection(e);
                }
            }
        }
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final NestedScrollView w = this.G0.w;
        return (w != null && w.g(keyEvent)) || super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final NestedScrollView w = this.G0.w;
        return (w != null && w.g(keyEvent)) || super.onKeyUp(n, keyEvent);
    }
    
    @Override
    public final void setTitle(final CharSequence text) {
        super.setTitle(text);
        final AlertController g0 = this.G0;
        g0.e = text;
        final TextView a = g0.A;
        if (a != null) {
            a.setText(text);
        }
    }
}
