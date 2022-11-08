import android.view.View;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zq extends cnd<Integer>
{
    public final AdapterView<?> C0;
    
    public zq(final AdapterView<?> c0) {
        this.C0 = c0;
    }
    
    @Override
    public final Object d() {
        return this.C0.getSelectedItemPosition();
    }
    
    @Override
    public final void e(final wbj<? super Integer> wbj) {
        zzd.g((Object)wbj, "observer");
        if (!m8y.i(wbj)) {
            return;
        }
        final a onItemSelectedListener = new a(this.C0, wbj);
        this.C0.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)onItemSelectedListener);
        wbj.onSubscribe((j29)onItemSelectedListener);
    }
    
    public static final class a extends fig implements AdapterView$OnItemSelectedListener
    {
        public final AdapterView<?> D0;
        public final wbj<? super Integer> E0;
        
        public a(final AdapterView<?> d0, final wbj<? super Integer> e0) {
            zzd.g((Object)d0, "view");
            zzd.g((Object)e0, "observer");
            this.D0 = d0;
            this.E0 = e0;
        }
        
        public final void c() {
            this.D0.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)null);
        }
        
        public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
            zzd.g((Object)adapterView, "adapterView");
            if (!this.isDisposed()) {
                this.E0.onNext((Object)n);
            }
        }
        
        public final void onNothingSelected(final AdapterView<?> adapterView) {
            zzd.g((Object)adapterView, "adapterView");
            if (!this.isDisposed()) {
                this.E0.onNext((Object)(-1));
            }
        }
    }
}
