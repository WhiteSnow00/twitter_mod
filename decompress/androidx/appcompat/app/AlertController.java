// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.widget.ArrayAdapter;
import java.lang.ref.WeakReference;
import android.os.Handler;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.DialogInterface;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.widget.Button;
import android.view.Window;
import android.content.Context;
import android.widget.ListAdapter;
import android.view.View;
import android.widget.TextView;

public final class AlertController
{
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public c M;
    public final AlertController$a N;
    public final Context a;
    public final dk0 b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public RecycleListView g;
    public View h;
    public int i;
    public boolean j;
    public Button k;
    public CharSequence l;
    public Message m;
    public Drawable n;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public NestedScrollView w;
    public int x;
    public Drawable y;
    public ImageView z;
    
    public AlertController(final Context a, final dk0 b, final Window c) {
        this.j = false;
        this.x = 0;
        this.E = -1;
        this.N = new View$OnClickListener(this) {
            public final AlertController F0;
            
            public final void onClick(final View view) {
                final AlertController f0 = this.F0;
                Message message = null;
                Label_0082: {
                    if (view == f0.k) {
                        final Message m = f0.m;
                        if (m != null) {
                            message = Message.obtain(m);
                            break Label_0082;
                        }
                    }
                    if (view == f0.o) {
                        final Message q = f0.q;
                        if (q != null) {
                            message = Message.obtain(q);
                            break Label_0082;
                        }
                    }
                    if (view == f0.s) {
                        final Message u = f0.u;
                        if (u != null) {
                            message = Message.obtain(u);
                            break Label_0082;
                        }
                    }
                    message = null;
                }
                if (message != null) {
                    message.sendToTarget();
                }
                final AlertController f2 = this.F0;
                f2.M.obtainMessage(1, (Object)f2.b).sendToTarget();
            }
        };
        this.a = a;
        this.b = b;
        this.c = c;
        this.M = new c((DialogInterface)b);
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes((AttributeSet)null, fr0.L0, 2130968660, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        this.G = obtainStyledAttributes.getResourceId(2, 0);
        this.H = obtainStyledAttributes.getResourceId(4, 0);
        this.I = obtainStyledAttributes.getResourceId(5, 0);
        this.J = obtainStyledAttributes.getResourceId(7, 0);
        this.K = obtainStyledAttributes.getResourceId(3, 0);
        this.L = obtainStyledAttributes.getBoolean(6, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b.j();
    }
    
    public static boolean a(final View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        int i = viewGroup.getChildCount();
        while (i > 0) {
            if (a(viewGroup.getChildAt(--i))) {
                return true;
            }
        }
        return false;
    }
    
    public static void c(final View view, final View view2, final View view3) {
        final int n = 0;
        if (view2 != null) {
            int visibility;
            if (view.canScrollVertically(-1)) {
                visibility = 0;
            }
            else {
                visibility = 4;
            }
            view2.setVisibility(visibility);
        }
        if (view3 != null) {
            int visibility2;
            if (view.canScrollVertically(1)) {
                visibility2 = n;
            }
            else {
                visibility2 = 4;
            }
            view3.setVisibility(visibility2);
        }
    }
    
    public final void b(final Button button) {
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)((View)button).getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        ((View)button).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public final ViewGroup d(View inflate, View inflate2) {
        if (inflate == null) {
            inflate = inflate2;
            if (inflate2 instanceof ViewStub) {
                inflate = ((ViewStub)inflate2).inflate();
            }
            return (ViewGroup)inflate;
        }
        if (inflate2 != null) {
            final ViewParent parent = inflate2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(inflate2);
            }
        }
        inflate2 = inflate;
        if (inflate instanceof ViewStub) {
            inflate2 = ((ViewStub)inflate).inflate();
        }
        return (ViewGroup)inflate2;
    }
    
    public final void e(final int n, final CharSequence t, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        Message obtainMessage;
        if (dialogInterface$OnClickListener != null) {
            obtainMessage = this.M.obtainMessage(n, (Object)dialogInterface$OnClickListener);
        }
        else {
            obtainMessage = null;
        }
        if (n != -3) {
            if (n != -2) {
                if (n != -1) {
                    throw new IllegalArgumentException("Button does not exist");
                }
                this.l = t;
                this.m = obtainMessage;
                this.n = null;
            }
            else {
                this.p = t;
                this.q = obtainMessage;
                this.r = null;
            }
        }
        else {
            this.t = t;
            this.u = obtainMessage;
            this.v = null;
        }
    }
    
    public final void f(final int x) {
        this.y = null;
        this.x = x;
        final ImageView z = this.z;
        if (z != null) {
            if (x != 0) {
                z.setVisibility(0);
                this.z.setImageResource(this.x);
            }
            else {
                z.setVisibility(8);
            }
        }
    }
    
    public static class RecycleListView extends ListView
    {
        public final int F0;
        public final int G0;
        
        public RecycleListView(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, fr0.a1);
            this.G0 = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.F0 = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }
    
    public static final class b
    {
        public final Context a;
        public final LayoutInflater b;
        public int c;
        public Drawable d;
        public CharSequence e;
        public View f;
        public CharSequence g;
        public CharSequence h;
        public DialogInterface$OnClickListener i;
        public CharSequence j;
        public DialogInterface$OnClickListener k;
        public CharSequence l;
        public DialogInterface$OnClickListener m;
        public boolean n;
        public DialogInterface$OnCancelListener o;
        public DialogInterface$OnDismissListener p;
        public DialogInterface$OnKeyListener q;
        public CharSequence[] r;
        public ListAdapter s;
        public DialogInterface$OnClickListener t;
        public View u;
        public boolean[] v;
        public boolean w;
        public boolean x;
        public int y;
        public DialogInterface$OnMultiChoiceClickListener z;
        
        public b(final Context a) {
            this.c = 0;
            this.y = -1;
            this.a = a;
            this.n = true;
            this.b = (LayoutInflater)a.getSystemService("layout_inflater");
        }
    }
    
    public static final class c extends Handler
    {
        public WeakReference<DialogInterface> a;
        
        public c(final DialogInterface dialogInterface) {
            this.a = new WeakReference<DialogInterface>(dialogInterface);
        }
        
        public final void handleMessage(final Message message) {
            final int what = message.what;
            if (what != -3 && what != -2 && what != -1) {
                if (what == 1) {
                    ((DialogInterface)message.obj).dismiss();
                }
            }
            else {
                ((DialogInterface$OnClickListener)message.obj).onClick((DialogInterface)this.a.get(), message.what);
            }
        }
    }
    
    public static final class d extends ArrayAdapter<CharSequence>
    {
        public d(final Context context, final int n, final CharSequence[] array) {
            super(context, n, 16908308, (Object[])array);
        }
        
        public final long getItemId(final int n) {
            return n;
        }
        
        public final boolean hasStableIds() {
            return true;
        }
    }
}
