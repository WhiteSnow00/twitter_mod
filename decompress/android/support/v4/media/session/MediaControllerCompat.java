// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.support.v4.media.MediaDescriptionCompat;
import android.media.session.MediaSession$QueueItem;
import android.media.session.PlaybackState$CustomAction;
import android.media.session.PlaybackState;
import java.util.Objects;
import android.os.Parcel;
import android.media.MediaMetadata;
import androidx.media.AudioAttributesCompat;
import android.os.Build$VERSION;
import android.media.session.MediaController$PlaybackInfo;
import android.media.session.MediaController$Callback;
import android.os.IBinder$DeathRecipient;
import android.support.v4.media.MediaMetadataCompat;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import android.os.RemoteException;
import android.util.Log;
import android.os.ResultReceiver;
import android.os.Bundle;
import android.media.session.MediaSession$Token;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.media.session.MediaController;
import j$.util.concurrent.ConcurrentHashMap;
import android.content.Context;

public final class MediaControllerCompat
{
    public final MediaControllerImplApi21 a;
    
    public MediaControllerCompat(final Context context, final MediaSessionCompat.Token token) {
        new ConcurrentHashMap();
        this.a = new MediaControllerImplApi21(context, token);
    }
    
    public static class MediaControllerImplApi21
    {
        public final MediaController a;
        public final Object b;
        public final List<MediaControllerCompat.a> c;
        public HashMap<MediaControllerCompat.a, a> d;
        public final MediaSessionCompat.Token e;
        
        public MediaControllerImplApi21(final Context context, final MediaSessionCompat.Token e) {
            this.b = new Object();
            this.c = new ArrayList();
            this.d = new HashMap<MediaControllerCompat.a, a>();
            this.e = e;
            final MediaController a = new MediaController(context, (MediaSession$Token)e.G0);
            this.a = a;
            if (e.a() == null) {
                a.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle)null, (ResultReceiver)new ExtraBinderRequestResultReceiver(this));
            }
        }
        
        public final void a() {
            if (this.e.a() == null) {
                return;
            }
            for (final MediaControllerCompat.a a : this.c) {
                final a a2 = new a(a);
                this.d.put(a, a2);
                a.a = a2;
                try {
                    this.e.a().X0((android.support.v4.media.session.a)a2);
                    continue;
                }
                catch (final RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)ex);
                }
                break;
            }
            this.c.clear();
        }
        
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver
        {
            public WeakReference<MediaControllerImplApi21> F0;
            
            public ExtraBinderRequestResultReceiver(final MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler)null);
                this.F0 = new WeakReference<MediaControllerImplApi21>(mediaControllerImplApi21);
            }
            
            public final void onReceiveResult(final int p0, final Bundle p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.F0:Ljava/lang/ref/WeakReference;
                //     4: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
                //     7: checkcast       Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;
                //    10: astore          5
                //    12: aload           5
                //    14: ifnull          184
                //    17: aload_2        
                //    18: ifnonnull       24
                //    21: goto            184
                //    24: aload           5
                //    26: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.b:Ljava/lang/Object;
                //    29: astore          4
                //    31: aload           4
                //    33: monitorenter   
                //    34: aload           5
                //    36: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.e:Landroid/support/v4/media/session/MediaSessionCompat$Token;
                //    39: astore          7
                //    41: aload_2        
                //    42: ldc             "android.support.v4.media.session.EXTRA_BINDER"
                //    44: invokestatic    rt2.a:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;
                //    47: invokestatic    android/support/v4/media/session/b$a.s:(Landroid/os/IBinder;)Landroid/support/v4/media/session/b;
                //    50: astore          6
                //    52: aload           7
                //    54: getfield        android/support/v4/media/session/MediaSessionCompat$Token.F0:Ljava/lang/Object;
                //    57: astore_3       
                //    58: aload_3        
                //    59: monitorenter   
                //    60: aload           7
                //    62: aload           6
                //    64: putfield        android/support/v4/media/session/MediaSessionCompat$Token.H0:Landroid/support/v4/media/session/b;
                //    67: aload_3        
                //    68: monitorexit    
                //    69: aload           5
                //    71: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.e:Landroid/support/v4/media/session/MediaSessionCompat$Token;
                //    74: astore          6
                //    76: aconst_null    
                //    77: astore_3       
                //    78: aload_2        
                //    79: ldc             "android.support.v4.media.session.SESSION_TOKEN2"
                //    81: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
                //    84: checkcast       Landroid/os/Bundle;
                //    87: astore_2       
                //    88: aload_2        
                //    89: ifnonnull       97
                //    92: aload_3        
                //    93: astore_2       
                //    94: goto            143
                //    97: aload_2        
                //    98: ldc             Ltwj;.class
                //   100: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
                //   103: invokevirtual   android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
                //   106: aload_2        
                //   107: ldc             "a"
                //   109: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
                //   112: astore_2       
                //   113: aload_2        
                //   114: instanceof      Landroidx/versionedparcelable/ParcelImpl;
                //   117: ifeq            131
                //   120: aload_2        
                //   121: checkcast       Landroidx/versionedparcelable/ParcelImpl;
                //   124: getfield        androidx/versionedparcelable/ParcelImpl.F0:Lftw;
                //   127: astore_2       
                //   128: goto            143
                //   131: new             Ljava/lang/IllegalArgumentException;
                //   134: astore_2       
                //   135: aload_2        
                //   136: ldc             "Invalid parcel"
                //   138: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
                //   141: aload_2        
                //   142: athrow         
                //   143: aload           6
                //   145: getfield        android/support/v4/media/session/MediaSessionCompat$Token.F0:Ljava/lang/Object;
                //   148: astore_3       
                //   149: aload_3        
                //   150: monitorenter   
                //   151: aload           6
                //   153: aload_2        
                //   154: putfield        android/support/v4/media/session/MediaSessionCompat$Token.I0:Lftw;
                //   157: aload_3        
                //   158: monitorexit    
                //   159: aload           5
                //   161: invokevirtual   android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.a:()V
                //   164: aload           4
                //   166: monitorexit    
                //   167: return         
                //   168: astore_2       
                //   169: aload_3        
                //   170: monitorexit    
                //   171: aload_2        
                //   172: athrow         
                //   173: astore_2       
                //   174: aload_3        
                //   175: monitorexit    
                //   176: aload_2        
                //   177: athrow         
                //   178: astore_2       
                //   179: aload           4
                //   181: monitorexit    
                //   182: aload_2        
                //   183: athrow         
                //   184: return         
                //   185: astore_2       
                //   186: aload_3        
                //   187: astore_2       
                //   188: goto            143
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  34     60     178    184    Any
                //  60     69     173    178    Any
                //  69     76     178    184    Any
                //  78     88     185    191    Ljava/lang/RuntimeException;
                //  78     88     178    184    Any
                //  97     128    185    191    Ljava/lang/RuntimeException;
                //  97     128    178    184    Any
                //  131    143    185    191    Ljava/lang/RuntimeException;
                //  131    143    178    184    Any
                //  143    151    178    184    Any
                //  151    159    168    173    Any
                //  159    167    178    184    Any
                //  169    171    168    173    Any
                //  171    173    178    184    Any
                //  174    176    173    178    Any
                //  176    178    178    184    Any
                //  179    182    178    184    Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0097:
                //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
                //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
                //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
                //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        }
        
        public static final class a extends MediaControllerCompat$a$b
        {
            public a(final MediaControllerCompat.a a) {
                super(a);
            }
            
            public final void M1(final List<MediaSessionCompat.QueueItem> p0) throws RemoteException {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: invokespecial   java/lang/AssertionError.<init>:()V
                //     7: athrow         
                //    Exceptions:
                //  throws android.os.RemoteException
                //    Signature:
                //  (Ljava/util/List<Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;>;)V
                // 
                // The error that occurred was:
                // 
                // java.lang.ArrayIndexOutOfBoundsException: 1
                //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
                //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
                //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
                //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
                //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
            
            public final void N() throws RemoteException {
                throw new AssertionError();
            }
            
            public final void V0(final ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
            
            public final void f0() throws RemoteException {
                throw new AssertionError();
            }
            
            public final void q0() throws RemoteException {
                throw new AssertionError();
            }
            
            public final void s0(final MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
        }
    }
    
    public abstract static class a implements IBinder$DeathRecipient
    {
        public MediaControllerImplApi21.a a;
        
        public a() {
            new MediaControllerCompat.a.a(this);
        }
        
        public final void binderDied() {
        }
        
        public static final class a extends MediaController$Callback
        {
            public final WeakReference<MediaControllerCompat.a> a;
            
            public a(final MediaControllerCompat.a a) {
                this.a = new WeakReference<MediaControllerCompat.a>(a);
            }
            
            public final void onAudioInfoChanged(final MediaController$PlaybackInfo mediaController$PlaybackInfo) {
                if (this.a.get() != null) {
                    mediaController$PlaybackInfo.getPlaybackType();
                    mediaController$PlaybackInfo.getAudioAttributes();
                    if (Build$VERSION.SDK_INT >= 26) {
                        new(androidx.media.AudioAttributesCompat.class)();
                    }
                    else {
                        new(androidx.media.AudioAttributesCompat.class)();
                    }
                    mediaController$PlaybackInfo.getVolumeControl();
                    mediaController$PlaybackInfo.getMaxVolume();
                    mediaController$PlaybackInfo.getCurrentVolume();
                }
            }
            
            public final void onExtrasChanged(final Bundle bundle) {
                MediaSessionCompat.a(bundle);
                final MediaControllerCompat.a a = this.a.get();
            }
            
            public final void onMetadataChanged(final MediaMetadata mediaMetadata) {
                if (this.a.get() != null) {
                    final ws0<String, Integer> g0 = MediaMetadataCompat.G0;
                    if (mediaMetadata != null) {
                        final Parcel obtain = Parcel.obtain();
                        mediaMetadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        final MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        Objects.requireNonNull(mediaMetadataCompat);
                    }
                }
            }
            
            public final void onPlaybackStateChanged(final PlaybackState playbackState) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    if (a.a == null) {
                        Bundle a2 = null;
                        if (playbackState != null) {
                            final List<PlaybackState$CustomAction> j = PlaybackStateCompat.b.j(playbackState);
                            ArrayList<PlaybackStateCompat.CustomAction> list2;
                            if (j != null) {
                                final ArrayList list = new ArrayList<PlaybackStateCompat.CustomAction>(j.size());
                                for (final Object next : j) {
                                    Object o;
                                    if (next != null) {
                                        final PlaybackState$CustomAction playbackState$CustomAction = (PlaybackState$CustomAction)next;
                                        final Bundle l = PlaybackStateCompat.b.l(playbackState$CustomAction);
                                        MediaSessionCompat.a(l);
                                        o = new PlaybackStateCompat.CustomAction(PlaybackStateCompat.b.f(playbackState$CustomAction), PlaybackStateCompat.b.o(playbackState$CustomAction), PlaybackStateCompat.b.m(playbackState$CustomAction), l);
                                    }
                                    else {
                                        o = null;
                                    }
                                    list.add((PlaybackStateCompat.CustomAction)o);
                                }
                                list2 = (ArrayList<PlaybackStateCompat.CustomAction>)list;
                            }
                            else {
                                list2 = null;
                            }
                            if (Build$VERSION.SDK_INT >= 22) {
                                a2 = PlaybackStateCompat.c.a(playbackState);
                                MediaSessionCompat.a(a2);
                            }
                            new PlaybackStateCompat(PlaybackStateCompat.b.r(playbackState), PlaybackStateCompat.b.q(playbackState), PlaybackStateCompat.b.i(playbackState), PlaybackStateCompat.b.p(playbackState), PlaybackStateCompat.b.g(playbackState), 0, PlaybackStateCompat.b.k(playbackState), PlaybackStateCompat.b.n(playbackState), list2, PlaybackStateCompat.b.h(playbackState), a2);
                        }
                    }
                }
            }
            
            public final void onQueueChanged(final List<MediaSession$QueueItem> list) {
                if (this.a.get() != null && list != null) {
                    final ArrayList list2 = new ArrayList();
                    for (final MediaSession$QueueItem next : list) {
                        Object o;
                        if (next != null) {
                            final MediaSession$QueueItem mediaSession$QueueItem = next;
                            o = new MediaSessionCompat.QueueItem(MediaDescriptionCompat.a(MediaSessionCompat.QueueItem.b.b(mediaSession$QueueItem)), MediaSessionCompat.QueueItem.b.c(mediaSession$QueueItem));
                        }
                        else {
                            o = null;
                        }
                        list2.add(o);
                    }
                }
            }
            
            public final void onQueueTitleChanged(final CharSequence charSequence) {
                final MediaControllerCompat.a a = this.a.get();
            }
            
            public final void onSessionDestroyed() {
                final MediaControllerCompat.a a = this.a.get();
            }
            
            public final void onSessionEvent(final String s, final Bundle bundle) {
                MediaSessionCompat.a(bundle);
                final MediaControllerCompat.a a = this.a.get();
            }
        }
    }
}
