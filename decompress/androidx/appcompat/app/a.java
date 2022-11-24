// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.view.KeyEvent;
import android.content.Context;

public abstract class a
{
    public boolean a() {
        return false;
    }
    
    public abstract boolean b();
    
    public abstract void c(final boolean p0);
    
    public abstract int d();
    
    public abstract Context e();
    
    public boolean f() {
        return false;
    }
    
    public abstract void g();
    
    public void h() {
    }
    
    public abstract boolean i(final int p0, final KeyEvent p1);
    
    public boolean j(final KeyEvent keyEvent) {
        return false;
    }
    
    public boolean k() {
        return false;
    }
    
    public abstract void l(final View p0);
    
    public abstract void m(final View p0, final a p1);
    
    public abstract void n(final boolean p0);
    
    public abstract void o(final boolean p0);
    
    public abstract void p(final int p0);
    
    public abstract void q(final boolean p0);
    
    public abstract void r();
    
    public abstract void s(final boolean p0);
    
    public abstract void t(final boolean p0);
    
    public abstract void u(final CharSequence p0);
    
    public al v(final al$a al$a) {
        return null;
    }
    
    public static class a extends ViewGroup$MarginLayoutParams
    {
        public int a;
        
        public a(final int n, final int n2) {
            super(n, n2);
            this.a = 8388627;
        }
        
        public a(final int n, final int n2, final int a) {
            super(-2, n2);
            this.a = a;
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.a = 0;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, fr0.I0);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = 0;
        }
        
        public a(final a a) {
            super((ViewGroup$MarginLayoutParams)a);
            this.a = 0;
            this.a = a.a;
        }
    }
    
    public interface b
    {
        void a();
    }
    
    @Deprecated
    public abstract static class c
    {
        public abstract void a();
    }
}
