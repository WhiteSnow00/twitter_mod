import android.view.KeyEvent;
import android.widget.TextView$OnEditorActionListener;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljs extends b5j<Integer>
{
    public final TextView C0;
    public final rtb<Integer, Boolean> D0;
    
    public ljs(final TextView c0, final rtb<? super Integer, Boolean> d0) {
        this.C0 = c0;
        this.D0 = (rtb<Integer, Boolean>)d0;
    }
    
    public final void subscribeActual(final wbj<? super Integer> wbj) {
        zzd.g((Object)wbj, "observer");
        if (!m8y.i(wbj)) {
            return;
        }
        final a onEditorActionListener = new a(this.C0, wbj, this.D0);
        wbj.onSubscribe((j29)onEditorActionListener);
        this.C0.setOnEditorActionListener((TextView$OnEditorActionListener)onEditorActionListener);
    }
    
    public static final class a extends fig implements TextView$OnEditorActionListener
    {
        public final TextView D0;
        public final wbj<? super Integer> E0;
        public final rtb<Integer, Boolean> F0;
        
        public a(final TextView d0, final wbj<? super Integer> e0, final rtb<? super Integer, Boolean> f0) {
            zzd.g((Object)d0, "view");
            zzd.g((Object)e0, "observer");
            zzd.g((Object)f0, "handled");
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = (rtb<Integer, Boolean>)f0;
        }
        
        public final void c() {
            this.D0.setOnEditorActionListener((TextView$OnEditorActionListener)null);
        }
        
        public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
            zzd.g((Object)textView, "textView");
            try {
                if (!this.isDisposed() && (boolean)this.F0.invoke((Object)n)) {
                    this.E0.onNext((Object)n);
                    return true;
                }
            }
            catch (final Exception ex) {
                this.E0.onError((Throwable)ex);
                this.dispose();
            }
            return false;
        }
    }
}
