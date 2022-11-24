import android.view.View$OnTouchListener;
import android.view.View;
import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qcx extends t5j<MotionEvent>
{
    public final View F0;
    public final stb<MotionEvent, Boolean> G0;
    
    public qcx(final View f0, final stb<? super MotionEvent, Boolean> g0) {
        e0e.g((Object)f0, "view");
        e0e.g((Object)g0, "handled");
        this.F0 = f0;
        this.G0 = (stb<MotionEvent, Boolean>)g0;
    }
    
    public final void subscribeActual(final ocj<? super MotionEvent> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a onTouchListener = new a(this.F0, this.G0, ocj);
        ocj.onSubscribe((b39)onTouchListener);
        this.F0.setOnTouchListener((View$OnTouchListener)onTouchListener);
    }
    
    public static final class a extends wig implements View$OnTouchListener
    {
        public final View G0;
        public final stb<MotionEvent, Boolean> H0;
        public final ocj<? super MotionEvent> I0;
        
        public a(final View g0, final stb<? super MotionEvent, Boolean> h0, final ocj<? super MotionEvent> i0) {
            e0e.g((Object)g0, "view");
            e0e.g((Object)h0, "handled");
            e0e.g((Object)i0, "observer");
            this.G0 = g0;
            this.H0 = (stb<MotionEvent, Boolean>)h0;
            this.I0 = i0;
        }
        
        public final void c() {
            this.G0.setOnTouchListener((View$OnTouchListener)null);
        }
        
        public final boolean onTouch(final View view, final MotionEvent motionEvent) {
            e0e.g((Object)view, "v");
            e0e.g((Object)motionEvent, "event");
            if (!this.isDisposed()) {
                try {
                    if (this.H0.invoke((Object)motionEvent)) {
                        this.I0.onNext((Object)motionEvent);
                        return true;
                    }
                }
                catch (final Exception ex) {
                    this.I0.onError((Throwable)ex);
                    this.dispose();
                }
            }
            return false;
        }
    }
}
