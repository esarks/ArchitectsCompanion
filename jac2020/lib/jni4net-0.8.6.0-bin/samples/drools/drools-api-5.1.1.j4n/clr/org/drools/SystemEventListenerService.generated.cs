//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
//     Runtime Version:2.0.50727.4952
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace org.drools {
    
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaInterfaceAttribute()]
    public partial interface SystemEventListenerService {
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Lorg/drools/SystemEventListener;)V")]
        void setSystemEventListener(global::org.drools.SystemEventListener par0);
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Lorg/drools/SystemEventListener;")]
        global::org.drools.SystemEventListener getSystemEventListener();
    }
    #endregion
    
    #region Component Designer generated code 
    public partial class SystemEventListenerService_ {
        
        public static global::java.lang.Class _class {
            get {
                return global::org.drools.@__SystemEventListenerService.staticClass;
            }
        }
    }
    #endregion
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaProxyAttribute(typeof(global::org.drools.SystemEventListenerService), typeof(global::org.drools.SystemEventListenerService_))]
    [global::net.sf.jni4net.attributes.ClrWrapperAttribute(typeof(global::org.drools.SystemEventListenerService), typeof(global::org.drools.SystemEventListenerService_))]
    internal sealed partial class @__SystemEventListenerService : global::java.lang.Object, global::org.drools.SystemEventListenerService {
        
        internal new static global::java.lang.Class staticClass;
        
        internal static global::net.sf.jni4net.jni.MethodId _setSystemEventListener0;
        
        internal static global::net.sf.jni4net.jni.MethodId _getSystemEventListener1;
        
        private @__SystemEventListenerService(global::net.sf.jni4net.jni.JNIEnv @__env) : 
                base(@__env) {
        }
        
        private static void InitJNI(global::net.sf.jni4net.jni.JNIEnv @__env, java.lang.Class @__class) {
            global::org.drools.@__SystemEventListenerService.staticClass = @__class;
            global::org.drools.@__SystemEventListenerService._setSystemEventListener0 = @__env.GetMethodID(global::org.drools.@__SystemEventListenerService.staticClass, "setSystemEventListener", "(Lorg/drools/SystemEventListener;)V");
            global::org.drools.@__SystemEventListenerService._getSystemEventListener1 = @__env.GetMethodID(global::org.drools.@__SystemEventListenerService.staticClass, "getSystemEventListener", "()Lorg/drools/SystemEventListener;");
        }
        
        public void setSystemEventListener(global::org.drools.SystemEventListener par0) {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 12)){
            @__env.CallVoidMethod(this, global::org.drools.@__SystemEventListenerService._setSystemEventListener0, global::net.sf.jni4net.utils.Convertor.ParFullC2J<global::org.drools.SystemEventListener>(@__env, par0));
            }
        }
        
        public global::org.drools.SystemEventListener getSystemEventListener() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.SystemEventListener>(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.@__SystemEventListenerService._getSystemEventListener1));
            }
        }
        
        private static global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod> @__Init(global::net.sf.jni4net.jni.JNIEnv @__env, global::java.lang.Class @__class) {
            global::System.Type @__type = typeof(__SystemEventListenerService);
            global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod> methods = new global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod>();
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "setSystemEventListener", "setSystemEventListener0", "(Lorg/drools/SystemEventListener;)V"));
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "getSystemEventListener", "getSystemEventListener1", "()Lorg/drools/SystemEventListener;"));
            return methods;
        }
        
        private static void setSystemEventListener0(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj, global::net.sf.jni4net.utils.JniLocalHandle par0) {
            // (Lorg/drools/SystemEventListener;)V
            // (Lorg/drools/SystemEventListener;)V
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            try {
            global::org.drools.SystemEventListenerService @__real = global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.SystemEventListenerService>(@__env, @__obj);
            @__real.setSystemEventListener(global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.SystemEventListener>(@__env, par0));
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
        }
        
        private static global::net.sf.jni4net.utils.JniHandle getSystemEventListener1(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj) {
            // ()Lorg/drools/SystemEventListener;
            // ()Lorg/drools/SystemEventListener;
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            global::net.sf.jni4net.utils.JniHandle @__return = default(global::net.sf.jni4net.utils.JniHandle);
            try {
            global::org.drools.SystemEventListenerService @__real = global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.SystemEventListenerService>(@__env, @__obj);
            @__return = global::net.sf.jni4net.utils.Convertor.FullC2J<global::org.drools.SystemEventListener>(@__env, @__real.getSystemEventListener());
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
            return @__return;
        }
        
        new internal sealed class ContructionHelper : global::net.sf.jni4net.utils.IConstructionHelper {
            
            public global::net.sf.jni4net.jni.IJvmProxy CreateProxy(global::net.sf.jni4net.jni.JNIEnv @__env) {
                return new global::org.drools.@__SystemEventListenerService(@__env);
            }
        }
    }
    #endregion
}
