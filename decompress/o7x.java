import android.view.ViewGroup;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7x<T extends View> extends r70
{
    public T W0;
    public qsb<? super Context, ? extends T> X0;
    public qsb<? super T, fzv> Y0;
    
    public o7x(final Context context, final qd6 qd6, final tbi tbi) {
        czd.f((Object)context, "context");
        czd.f((Object)tbi, "dispatcher");
        super(context, qd6, tbi);
        ((ViewGroup)this).setClipChildren(false);
        final t70$m a = t70.a;
        this.Y0 = (qsb<? super T, fzv>)t70.a;
    }
    
    public final qsb<Context, T> getFactory() {
        return (qsb<Context, T>)this.X0;
    }
    
    public /* bridge */ eb getSubCompositionView() {
        return null;
    }
    
    public final T getTypedView$ui_release() {
        return this.W0;
    }
    
    public final qsb<T, fzv> getUpdateBlock() {
        return (qsb<T, fzv>)this.Y0;
    }
    
    public View getViewRoot() {
        return (View)this;
    }
    
    public final void setFactory(final qsb<? super Context, ? extends T> x0) {
        this.X0 = x0;
        if (x0 != null) {
            final Context context = ((View)this).getContext();
            czd.e((Object)context, "context");
            this.setView$ui_release((View)(this.W0 = (T)x0.invoke((Object)context)));
        }
    }
    
    public final void setTypedView$ui_release(final T w0) {
        this.W0 = w0;
    }
    
    public final void setUpdateBlock(final qsb<? super T, fzv> y0) {
        czd.f((Object)y0, "value");
        this.Y0 = y0;
        this.setUpdate((nsb)new nsb<fzv>(this) {
            public final o7x<T> D0;
            
            public final Object invoke() {
                final View typedView$ui_release = this.D0.getTypedView$ui_release();
                if (typedView$ui_release != null) {
                    this.D0.getUpdateBlock().invoke((Object)typedView$ui_release);
                }
                return fzv.a;
            }
        });
    }
}
