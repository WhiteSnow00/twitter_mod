import android.opengl.GLES20;
import android.view.View;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.view.ViewGroup;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLConfig;
import android.opengl.EGL14;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q80 implements z2z
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    
    public q80(final Surface d) {
        this.d = d;
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.a = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        final int[] array = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
            this.a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        final EGLConfig[] array2 = { null };
        if (!EGL14.eglChooseConfig((EGLDisplay)this.a, new int[] { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 }, 0, array2, 0, 1, new int[] { 0 }, 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.b = EGL14.eglCreateContext((EGLDisplay)this.a, array2[0], EGL14.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
        this.b("eglCreateContext");
        if (this.b == null) {
            throw new RuntimeException("null context");
        }
        this.c = EGL14.eglCreateWindowSurface((EGLDisplay)this.a, array2[0], (Object)this.d, new int[] { 12344 }, 0);
        this.b("eglCreateWindowSurface");
        if (this.c != null) {
            return;
        }
        throw new RuntimeException("surface was null");
    }
    
    public q80(final ViewGroup a) {
        this.a = a;
        this.b = ((View)a).findViewById(2131431985);
        this.c = ((View)this.a).findViewById(2131431982);
        this.d = ((View)this.a).findViewById(2131431975);
    }
    
    public q80(final e80 a, final e80 b, final f80 c, final f80 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public q80(final f100 d, final n3r a, final Intent b, final Context c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        final f100 f100 = (f100)this.d;
        f100.g.post((Runnable)new v000(f100, (n3r)this.a, 5, 0));
    }
    
    public final void b(final String s) {
        boolean b = false;
        while (true) {
            final int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            final StringBuilder n = a88.n(s, ": EGL error: 0x");
            n.append(Integer.toHexString(eglGetError));
            nag.c("InputSurface", n.toString());
            b = true;
        }
        if (!b) {
            return;
        }
        throw new RuntimeException("EGL error encountered (see log)");
    }
    
    public final t5j c() {
        return vq9.a((View)this.a);
    }
    
    public final void d() {
        if (!((Intent)this.b).getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((Intent)this.b).putExtra("triggered_from_app_after_verification", true);
            ((Context)this.c).sendBroadcast((Intent)this.b);
            return;
        }
        ((loy)this.d).a.j("Splits copied and verified more than once.", new Object[0]);
    }
    
    public final void e(final int n) {
        final f100 f100 = (f100)this.d;
        f100.g.post((Runnable)new v000(f100, (n3r)this.a, 6, n));
    }
    
    public final void f() {
        final EGLDisplay eglDisplay = (EGLDisplay)this.a;
        final Object c = this.c;
        if (EGL14.eglMakeCurrent(eglDisplay, (EGLSurface)c, (EGLSurface)c, (EGLContext)this.b)) {
            final int[] array = new int[2];
            EGL14.eglQuerySurface((EGLDisplay)this.a, (EGLSurface)this.c, 12375, array, 0);
            EGL14.eglQuerySurface((EGLDisplay)this.a, (EGLSurface)this.c, 12374, array, 1);
            GLES20.glViewport(0, 0, array[0], array[1]);
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed");
    }
    
    public final void g() {
        if (EGL14.eglGetCurrentContext().equals((Object)this.b)) {
            final EGLDisplay eglDisplay = (EGLDisplay)this.a;
            final EGLSurface egl_NO_SURFACE = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eglDisplay, egl_NO_SURFACE, egl_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface((EGLDisplay)this.a, (EGLSurface)this.c);
        EGL14.eglDestroyContext((EGLDisplay)this.a, (EGLContext)this.b);
        ((Surface)this.d).release();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    public final void h() {
        final EGLDisplay eglDisplay = (EGLDisplay)this.a;
        final EGLSurface egl_NO_SURFACE = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eglDisplay, egl_NO_SURFACE, egl_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed");
    }
    
    public final void i(final int text) {
        ((TextView)this.b).setText(text);
    }
    
    public final void j(final String text) {
        ((TextView)this.c).setText((CharSequence)text);
    }
}
