//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
//     Runtime Version:2.0.50727.4952
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace org.drools.runtime.conf {
    
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaClassAttribute()]
    public partial class ClockTypeOption : global::java.lang.Object, global::org.drools.runtime.conf.SingleValueKnowledgeSessionOption {
        
        internal new static global::java.lang.Class staticClass;
        
        internal static global::net.sf.jni4net.jni.MethodId _getPropertyName0;
        
        internal static global::net.sf.jni4net.jni.MethodId _get1;
        
        internal static global::net.sf.jni4net.jni.MethodId _getClockType2;
        
        internal static global::net.sf.jni4net.jni.FieldId _PROPERTY_NAME3;
        
        protected ClockTypeOption(global::net.sf.jni4net.jni.JNIEnv @__env) : 
                base(@__env) {
        }
        
        public static global::java.lang.Class _class {
            get {
                return global::org.drools.runtime.conf.ClockTypeOption.staticClass;
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Ljava/lang/String;")]
        public static global::java.lang.String PROPERTY_NAME {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2CpString(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.runtime.conf.ClockTypeOption.staticClass, global::org.drools.runtime.conf.ClockTypeOption._PROPERTY_NAME3));
            }
            }
        }
        
        private static void InitJNI(global::net.sf.jni4net.jni.JNIEnv @__env, java.lang.Class @__class) {
            global::org.drools.runtime.conf.ClockTypeOption.staticClass = @__class;
            global::org.drools.runtime.conf.ClockTypeOption._getPropertyName0 = @__env.GetMethodID(global::org.drools.runtime.conf.ClockTypeOption.staticClass, "getPropertyName", "()Ljava/lang/String;");
            global::org.drools.runtime.conf.ClockTypeOption._get1 = @__env.GetStaticMethodID(global::org.drools.runtime.conf.ClockTypeOption.staticClass, "get", "(Ljava/lang/String;)Lorg/drools/runtime/conf/ClockTypeOption;");
            global::org.drools.runtime.conf.ClockTypeOption._getClockType2 = @__env.GetMethodID(global::org.drools.runtime.conf.ClockTypeOption.staticClass, "getClockType", "()Ljava/lang/String;");
            global::org.drools.runtime.conf.ClockTypeOption._PROPERTY_NAME3 = @__env.GetStaticFieldID(global::org.drools.runtime.conf.ClockTypeOption.staticClass, "PROPERTY_NAME", "Ljava/lang/String;");
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/String;")]
        public virtual global::java.lang.String getPropertyName() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2CpString(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.runtime.conf.ClockTypeOption._getPropertyName0));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Ljava/lang/String;)Lorg/drools/runtime/conf/ClockTypeOption;")]
        public static global::org.drools.runtime.conf.ClockTypeOption get(global::java.lang.String par0) {
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 12)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.runtime.conf.ClockTypeOption>(@__env, @__env.CallStaticObjectMethodPtr(global::org.drools.runtime.conf.ClockTypeOption.staticClass, global::org.drools.runtime.conf.ClockTypeOption._get1, global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par0)));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/String;")]
        public virtual global::java.lang.String getClockType() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2CpString(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.runtime.conf.ClockTypeOption._getClockType2));
            }
        }
        
        new internal sealed class ContructionHelper : global::net.sf.jni4net.utils.IConstructionHelper {
            
            public global::net.sf.jni4net.jni.IJvmProxy CreateProxy(global::net.sf.jni4net.jni.JNIEnv @__env) {
                return new global::org.drools.runtime.conf.ClockTypeOption(@__env);
            }
        }
    }
    #endregion
}
