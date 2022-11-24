import java.util.Iterator;
import android.text.TextUtils;
import java.util.regex.Pattern;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import android.net.TrafficStats;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h1b implements i1b
{
    public static final Object m;
    public static final h1b$a n;
    public final a1b a;
    public final e1b b;
    public final h8k c;
    public final znw d;
    public final e6d e;
    public final bxl f;
    public final Object g;
    public final ExecutorService h;
    public final ThreadPoolExecutor i;
    public String j;
    public Set<ixa> k;
    public final List<w9r> l;
    
    static {
        m = new Object();
        n = new h1b$a();
    }
    
    public h1b(final a1b a, final qml<hjc> qml) {
        final TimeUnit seconds = TimeUnit.SECONDS;
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        final h1b$a n = h1b.n;
        final ThreadPoolExecutor h = new ThreadPoolExecutor(0, 1, 30L, seconds, linkedBlockingQueue, (ThreadFactory)n);
        a.a();
        final e1b b = new e1b(a.a, (qml)qml);
        final h8k c = new h8k(a);
        final znw c2 = znw.c();
        final e6d e = new e6d(a);
        final bxl f = new bxl();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = c2;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = new ThreadPoolExecutor(0, 1, 30L, seconds, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)n);
    }
    
    public static h1b e() {
        return (h1b)a1b.c().b((Class)i1b.class);
    }
    
    public final void a(final boolean b) {
        synchronized (h1b.m) {
            final a1b a = this.a;
            a.a();
            final su6 b2 = su6.b(a.a);
            try {
                i8k i8k2;
                final i8k i8k = i8k2 = this.c.c();
                if (i8k.i()) {
                    final String h = this.h(i8k);
                    final h8k c = this.c;
                    final sb1.a a2 = new sb1.a(i8k);
                    a2.a = h;
                    a2.b = 3;
                    i8k2 = a2.a();
                    c.b(i8k2);
                }
                if (b2 != null) {
                    b2.f();
                }
                monitorexit(h1b.m);
                i8k a3 = i8k2;
                if (b) {
                    final sb1.a a4 = new sb1.a(i8k2);
                    a4.c = null;
                    a3 = a4.a();
                }
                this.k(a3);
                this.i.execute((Runnable)new g1b((Object)this, b, 0));
            }
            finally {
                if (b2 != null) {
                    b2.f();
                }
            }
        }
    }
    
    public final i8k b(final i8k i8k) throws FirebaseInstallationsException {
        final e1b b = this.b;
        final String c = this.c();
        final sb1 sb1 = (sb1)i8k;
        final String b2 = sb1.b;
        final String f = this.f();
        final String e = sb1.e;
        if (!b.c.a()) {
            goto Label_0529;
        }
        final URL a = b.a(String.format("projects/%s/installations/%s/authTokens:generate", f, b2));
        if (0 > 1) {
            goto Label_0518;
        }
        TrafficStats.setThreadStatsTag(32771);
        final HttpURLConnection c2 = b.c(a, c);
        try {
            c2.setRequestMethod("POST");
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("FIS_v2 ");
            sb2.append(e);
            c2.addRequestProperty("Authorization", sb2.toString());
            c2.setDoOutput(true);
            b.h(c2);
            final int responseCode = c2.getResponseCode();
            b.c.b(responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                b.f(c2);
                goto Label_0324;
            }
            goto Label_0208;
        }
        catch (final AssertionError | IOException ex) {
            goto Label_0504;
        }
        finally {
            goto Label_0494;
        }
        try {
            this.j = null;
            monitorexit(this);
            final sb1.a a2 = new sb1.a(sb1);
            a2.b = 2;
            return a2.a();
        }
        finally {}
    }
    
    public final String c() {
        final a1b a = this.a;
        a.a();
        return a.c.a;
    }
    
    public final String d() {
        final a1b a = this.a;
        a.a();
        return a.c.b;
    }
    
    public final String f() {
        final a1b a = this.a;
        a.a();
        return a.c.g;
    }
    
    public final void g() {
        iuk.A(this.d(), (Object)"Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iuk.A(this.f(), (Object)"Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iuk.A(this.c(), (Object)"Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        final String d = this.d();
        final Pattern c = znw.c;
        iuk.q(d.contains(":"), (Object)"Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iuk.q(znw.c.matcher(this.c()).matches(), (Object)"Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
    
    public final mcs<String> getId() {
        this.g();
        synchronized (this) {
            final String j = this.j;
            monitorexit(this);
            if (j != null) {
                return (mcs<String>)mds.e((Object)j);
            }
            final rcs rcs = new rcs();
            final o2c o2c = new o2c(rcs);
            Object o = this.g;
            synchronized (o) {
                this.l.add(o2c);
                monitorexit(o);
                o = rcs.a;
                this.h.execute((Runnable)new r20((Object)this, 3));
                return (mcs<String>)o;
            }
        }
    }
    
    public final String h(final i8k i8k) {
        final a1b a = this.a;
        a.a();
        if (a.b.equals("CHIME_ANDROID_SDK") || this.a.h()) {
            final int c = ((sb1)i8k).c;
            boolean b = true;
            if (c != 1) {
                b = false;
            }
            if (b) {
                final e6d e = this.e;
                Object o = e.a;
                synchronized (o) {
                    synchronized (e.a) {
                        String s = e.a.getString("|S|id", (String)null);
                        monitorexit(e.a);
                        if (s != null) {
                            monitorexit(o);
                        }
                        else {
                            s = e.a();
                            monitorexit(o);
                        }
                        o = s;
                        if (TextUtils.isEmpty((CharSequence)s)) {
                            o = this.f.a();
                        }
                        return (String)o;
                    }
                }
            }
        }
        return this.f.a();
    }
    
    public final i8k i(final i8k p0) throws FirebaseInstallationsException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Lsb1;
        //     4: astore          12
        //     6: aload           12
        //     8: getfield        sb1.b:Ljava/lang/String;
        //    11: astore          13
        //    13: aconst_null    
        //    14: astore          11
        //    16: aconst_null    
        //    17: astore          10
        //    19: aload           11
        //    21: astore_1       
        //    22: aload           13
        //    24: ifnull          220
        //    27: aload           11
        //    29: astore_1       
        //    30: aload           13
        //    32: invokevirtual   java/lang/String.length:()I
        //    35: bipush          11
        //    37: if_icmpne       220
        //    40: aload_0        
        //    41: getfield        h1b.e:Le6d;
        //    44: astore          14
        //    46: aload           14
        //    48: getfield        e6d.a:Landroid/content/SharedPreferences;
        //    51: astore          13
        //    53: aload           13
        //    55: monitorenter   
        //    56: getstatic       e6d.c:[Ljava/lang/String;
        //    59: astore          15
        //    61: iconst_0       
        //    62: istore_2       
        //    63: iload_2        
        //    64: iconst_4       
        //    65: if_icmpge       206
        //    68: aload           15
        //    70: iload_2        
        //    71: aaload         
        //    72: astore          16
        //    74: aload           14
        //    76: getfield        e6d.b:Ljava/lang/String;
        //    79: astore_1       
        //    80: new             Ljava/lang/StringBuilder;
        //    83: astore          17
        //    85: aload           17
        //    87: invokespecial   java/lang/StringBuilder.<init>:()V
        //    90: aload           17
        //    92: ldc_w           "|T|"
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: pop            
        //    99: aload           17
        //   101: aload_1        
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: pop            
        //   106: aload           17
        //   108: ldc_w           "|"
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: pop            
        //   115: aload           17
        //   117: aload           16
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: pop            
        //   123: aload           17
        //   125: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   128: astore_1       
        //   129: aload           14
        //   131: getfield        e6d.a:Landroid/content/SharedPreferences;
        //   134: aload_1        
        //   135: aconst_null    
        //   136: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   141: astore_1       
        //   142: aload_1        
        //   143: ifnull          200
        //   146: aload_1        
        //   147: invokevirtual   java/lang/String.isEmpty:()Z
        //   150: ifne            200
        //   153: aload_1        
        //   154: ldc_w           "{"
        //   157: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   160: istore          5
        //   162: iload           5
        //   164: ifeq            194
        //   167: new             Lorg/json/JSONObject;
        //   170: astore          11
        //   172: aload           11
        //   174: aload_1        
        //   175: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   178: aload           11
        //   180: ldc_w           "token"
        //   183: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   186: astore_1       
        //   187: goto            194
        //   190: astore_1       
        //   191: goto            215
        //   194: aload           13
        //   196: monitorexit    
        //   197: goto            220
        //   200: iinc            2, 1
        //   203: goto            63
        //   206: aload           13
        //   208: monitorexit    
        //   209: aload           11
        //   211: astore_1       
        //   212: goto            220
        //   215: aload           13
        //   217: monitorexit    
        //   218: aload_1        
        //   219: athrow         
        //   220: aload_0        
        //   221: getfield        h1b.b:Le1b;
        //   224: astore          15
        //   226: aload_0        
        //   227: invokevirtual   h1b.c:()Ljava/lang/String;
        //   230: astore          18
        //   232: aload           12
        //   234: getfield        sb1.b:Ljava/lang/String;
        //   237: astore          13
        //   239: aload_0        
        //   240: invokevirtual   h1b.f:()Ljava/lang/String;
        //   243: astore          14
        //   245: aload_0        
        //   246: invokevirtual   h1b.d:()Ljava/lang/String;
        //   249: astore          16
        //   251: aload           15
        //   253: getfield        e1b.c:Lwpm;
        //   256: invokevirtual   wpm.a:()Z
        //   259: ifeq            706
        //   262: aload           15
        //   264: ldc_w           "projects/%s/installations"
        //   267: iconst_1       
        //   268: anewarray       Ljava/lang/Object;
        //   271: dup            
        //   272: iconst_0       
        //   273: aload           14
        //   275: aastore        
        //   276: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   279: invokevirtual   e1b.a:(Ljava/lang/String;)Ljava/net/URL;
        //   282: astore          17
        //   284: iconst_0       
        //   285: istore_2       
        //   286: iload_2        
        //   287: iconst_1       
        //   288: if_icmpgt       695
        //   291: ldc_w           32769
        //   294: invokestatic    android/net/TrafficStats.setThreadStatsTag:(I)V
        //   297: aload           15
        //   299: aload           17
        //   301: aload           18
        //   303: invokevirtual   e1b.c:(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
        //   306: astore          11
        //   308: aload           11
        //   310: ldc             "POST"
        //   312: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //   315: aload           11
        //   317: iconst_1       
        //   318: invokevirtual   java/net/URLConnection.setDoOutput:(Z)V
        //   321: aload_1        
        //   322: ifnull          341
        //   325: aload           11
        //   327: ldc_w           "x-goog-fis-android-iid-migration-auth"
        //   330: aload_1        
        //   331: invokevirtual   java/net/URLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   334: goto            341
        //   337: astore_1       
        //   338: goto            671
        //   341: aload           15
        //   343: aload           11
        //   345: aload           13
        //   347: aload           16
        //   349: invokevirtual   e1b.g:(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)V
        //   352: aload           11
        //   354: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   357: istore          4
        //   359: aload           15
        //   361: getfield        e1b.c:Lwpm;
        //   364: iload           4
        //   366: invokevirtual   wpm.b:(I)V
        //   369: iload           4
        //   371: sipush          200
        //   374: if_icmplt       390
        //   377: iload           4
        //   379: sipush          300
        //   382: if_icmpge       390
        //   385: iconst_1       
        //   386: istore_3       
        //   387: goto            392
        //   390: iconst_0       
        //   391: istore_3       
        //   392: iload_3        
        //   393: ifeq            419
        //   396: aload           15
        //   398: aload           11
        //   400: invokevirtual   e1b.e:(Ljava/net/HttpURLConnection;)Lmtd;
        //   403: astore          10
        //   405: aload           11
        //   407: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   410: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   413: aload           10
        //   415: astore_1       
        //   416: goto            492
        //   419: aload           11
        //   421: aload           16
        //   423: aload           18
        //   425: aload           14
        //   427: invokestatic    e1b.b:(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   430: iload           4
        //   432: sipush          429
        //   435: if_icmpeq       655
        //   438: iload           4
        //   440: sipush          500
        //   443: if_icmplt       457
        //   446: iload           4
        //   448: sipush          600
        //   451: if_icmpge       457
        //   454: goto            681
        //   457: ldc_w           "Firebase-Installations"
        //   460: ldc_w           "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
        //   463: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   466: pop            
        //   467: new             Lfb1;
        //   470: dup            
        //   471: aconst_null    
        //   472: aconst_null    
        //   473: aconst_null    
        //   474: aconst_null    
        //   475: iconst_2       
        //   476: invokespecial   fb1.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcit;I)V
        //   479: astore          10
        //   481: aload           11
        //   483: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   486: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   489: aload           10
        //   491: astore_1       
        //   492: aload_1        
        //   493: checkcast       Lfb1;
        //   496: astore          13
        //   498: aload           13
        //   500: getfield        fb1.e:I
        //   503: invokestatic    lb0.G:(I)I
        //   506: istore_2       
        //   507: iload_2        
        //   508: ifeq            554
        //   511: iload_2        
        //   512: iconst_1       
        //   513: if_icmpne       543
        //   516: new             Lsb1$a;
        //   519: dup            
        //   520: aload           12
        //   522: invokespecial   sb1$a.<init>:(Li8k;)V
        //   525: astore_1       
        //   526: aload_1        
        //   527: ldc_w           "BAD CONFIG"
        //   530: putfield        sb1$a.g:Ljava/lang/String;
        //   533: aload_1        
        //   534: iconst_5       
        //   535: putfield        sb1$a.b:I
        //   538: aload_1        
        //   539: invokevirtual   sb1$a.a:()Li8k;
        //   542: areturn        
        //   543: new             Lcom/google/firebase/installations/FirebaseInstallationsException;
        //   546: dup            
        //   547: ldc_w           "Firebase Installations Service is unavailable. Please try again later."
        //   550: invokespecial   com/google/firebase/installations/FirebaseInstallationsException.<init>:(Ljava/lang/String;)V
        //   553: athrow         
        //   554: aload           13
        //   556: getfield        fb1.b:Ljava/lang/String;
        //   559: astore_1       
        //   560: aload           13
        //   562: getfield        fb1.c:Ljava/lang/String;
        //   565: astore          10
        //   567: aload_0        
        //   568: getfield        h1b.d:Lznw;
        //   571: invokevirtual   znw.b:()J
        //   574: lstore          6
        //   576: aload           13
        //   578: getfield        fb1.d:Lcit;
        //   581: invokevirtual   cit.c:()Ljava/lang/String;
        //   584: astore          11
        //   586: aload           13
        //   588: getfield        fb1.d:Lcit;
        //   591: invokevirtual   cit.d:()J
        //   594: lstore          8
        //   596: new             Lsb1$a;
        //   599: dup            
        //   600: aload           12
        //   602: invokespecial   sb1$a.<init>:(Li8k;)V
        //   605: astore          12
        //   607: aload           12
        //   609: aload_1        
        //   610: putfield        sb1$a.a:Ljava/lang/String;
        //   613: aload           12
        //   615: iconst_4       
        //   616: putfield        sb1$a.b:I
        //   619: aload           12
        //   621: aload           11
        //   623: putfield        sb1$a.c:Ljava/lang/String;
        //   626: aload           12
        //   628: aload           10
        //   630: putfield        sb1$a.d:Ljava/lang/String;
        //   633: aload           12
        //   635: lload           8
        //   637: invokevirtual   sb1$a.b:(J)Li8k$a;
        //   640: pop            
        //   641: aload           12
        //   643: lload           6
        //   645: invokevirtual   sb1$a.d:(J)Li8k$a;
        //   648: pop            
        //   649: aload           12
        //   651: invokevirtual   sb1$a.a:()Li8k;
        //   654: areturn        
        //   655: new             Lcom/google/firebase/installations/FirebaseInstallationsException;
        //   658: astore          10
        //   660: aload           10
        //   662: ldc_w           "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
        //   665: invokespecial   com/google/firebase/installations/FirebaseInstallationsException.<init>:(Ljava/lang/String;)V
        //   668: aload           10
        //   670: athrow         
        //   671: aload           11
        //   673: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   676: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   679: aload_1        
        //   680: athrow         
        //   681: aload           11
        //   683: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   686: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   689: iinc            2, 1
        //   692: goto            286
        //   695: new             Lcom/google/firebase/installations/FirebaseInstallationsException;
        //   698: dup            
        //   699: ldc_w           "Firebase Installations Service is unavailable. Please try again later."
        //   702: invokespecial   com/google/firebase/installations/FirebaseInstallationsException.<init>:(Ljava/lang/String;)V
        //   705: athrow         
        //   706: new             Lcom/google/firebase/installations/FirebaseInstallationsException;
        //   709: dup            
        //   710: ldc_w           "Firebase Installations Service is unavailable. Please try again later."
        //   713: invokespecial   com/google/firebase/installations/FirebaseInstallationsException.<init>:(Ljava/lang/String;)V
        //   716: athrow         
        //   717: astore_1       
        //   718: aload           10
        //   720: astore_1       
        //   721: goto            194
        //   724: astore          10
        //   726: goto            681
        //    Exceptions:
        //  throws com.google.firebase.installations.FirebaseInstallationsException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  56     61     190    220    Any
        //  74     142    190    220    Any
        //  146    162    190    220    Any
        //  167    187    717    724    Lorg/json/JSONException;
        //  167    187    190    220    Any
        //  194    197    190    220    Any
        //  206    209    190    220    Any
        //  215    218    190    220    Any
        //  308    321    724    729    Ljava/lang/AssertionError;
        //  308    321    724    729    Ljava/io/IOException;
        //  308    321    337    341    Any
        //  325    334    724    729    Ljava/lang/AssertionError;
        //  325    334    724    729    Ljava/io/IOException;
        //  325    334    337    341    Any
        //  341    369    724    729    Ljava/lang/AssertionError;
        //  341    369    724    729    Ljava/io/IOException;
        //  341    369    337    341    Any
        //  396    405    724    729    Ljava/lang/AssertionError;
        //  396    405    724    729    Ljava/io/IOException;
        //  396    405    337    341    Any
        //  419    430    724    729    Ljava/lang/AssertionError;
        //  419    430    724    729    Ljava/io/IOException;
        //  419    430    337    341    Any
        //  457    481    724    729    Ljava/lang/AssertionError;
        //  457    481    724    729    Ljava/io/IOException;
        //  457    481    337    341    Any
        //  655    671    724    729    Ljava/lang/AssertionError;
        //  655    671    724    729    Ljava/io/IOException;
        //  655    671    337    341    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0194:
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
    
    public final void j(final Exception ex) {
        synchronized (this.g) {
            final Iterator iterator = this.l.iterator();
            while (iterator.hasNext()) {
                if (((w9r)iterator.next()).a(ex)) {
                    iterator.remove();
                }
            }
        }
    }
    
    public final void k(final i8k i8k) {
        synchronized (this.g) {
            final Iterator iterator = this.l.iterator();
            while (iterator.hasNext()) {
                if (((w9r)iterator.next()).b(i8k)) {
                    iterator.remove();
                }
            }
        }
    }
    
    public final mcs<ntd> l(boolean b) {
        this.g();
        final rcs rcs = new rcs();
        final g2c g2c = new g2c(this.d, rcs);
        b = (boolean)this.g;
        synchronized (b) {
            this.l.add(g2c);
            monitorexit(b);
            b = (boolean)rcs.a;
            this.h.execute((Runnable)new f1b((Object)this, false, 0));
            return (mcs<ntd>)b;
        }
    }
}
