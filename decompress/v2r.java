import android.view.View;
import android.hardware.SensorEventListener;
import android.view.View$OnTouchListener;
import android.opengl.GLSurfaceView$Renderer;
import android.view.WindowManager;
import java.util.Objects;
import android.os.Looper;
import android.util.AttributeSet;
import android.content.Context;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.concurrent.CopyOnWriteArrayList;
import android.opengl.GLSurfaceView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v2r extends GLSurfaceView
{
    public final CopyOnWriteArrayList<b> F0;
    public final SensorManager G0;
    public final Sensor H0;
    public final fpj I0;
    public final Handler J0;
    public final rvo K0;
    public SurfaceTexture L0;
    public Surface M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    
    public v2r(final Context context) {
        Sensor defaultSensor = null;
        super(context, (AttributeSet)null);
        this.F0 = new CopyOnWriteArrayList<b>();
        this.J0 = new Handler(Looper.getMainLooper());
        final Object systemService = context.getSystemService("sensor");
        Objects.requireNonNull(systemService);
        final SensorManager g0 = (SensorManager)systemService;
        this.G0 = g0;
        if (rnw.a >= 18) {
            defaultSensor = g0.getDefaultSensor(15);
        }
        Sensor defaultSensor2;
        if ((defaultSensor2 = defaultSensor) == null) {
            defaultSensor2 = g0.getDefaultSensor(11);
        }
        this.H0 = defaultSensor2;
        final rvo k0 = new rvo();
        this.K0 = k0;
        final v2r.v2r$a renderer = new v2r.v2r$a(this, k0);
        final cvt onTouchListener = new cvt(context, (cvt.cvt$a)renderer);
        final WindowManager windowManager = (WindowManager)context.getSystemService("window");
        Objects.requireNonNull(windowManager);
        this.I0 = new fpj(windowManager.getDefaultDisplay(), new fpj$a[] { (fpj$a)onTouchListener, (fpj$a)renderer });
        this.N0 = true;
        this.setEGLContextClientVersion(2);
        this.setRenderer((GLSurfaceView$Renderer)renderer);
        ((View)this).setOnTouchListener((View$OnTouchListener)onTouchListener);
    }
    
    public final void a() {
        final boolean p0 = this.N0 && this.O0;
        final Sensor h0 = this.H0;
        if (h0 != null) {
            if (p0 != this.P0) {
                if (p0) {
                    this.G0.registerListener((SensorEventListener)this.I0, h0, 0);
                }
                else {
                    this.G0.unregisterListener((SensorEventListener)this.I0);
                }
                this.P0 = p0;
            }
        }
    }
    
    public kd3 getCameraMotionListener() {
        return (kd3)this.K0;
    }
    
    public s0x getVideoFrameMetadataListener() {
        return (s0x)this.K0;
    }
    
    public Surface getVideoSurface() {
        return this.M0;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J0.post((Runnable)new f26((Object)this, 5));
    }
    
    public final void onPause() {
        this.O0 = false;
        this.a();
        super.onPause();
    }
    
    public final void onResume() {
        super.onResume();
        this.O0 = true;
        this.a();
    }
    
    public void setDefaultStereoMode(final int p) {
        this.K0.P0 = p;
    }
    
    public void setUseSensorRotation(final boolean n0) {
        this.N0 = n0;
        this.a();
    }
    
    public interface b
    {
        void g(final Surface p0);
        
        void p();
    }
}
