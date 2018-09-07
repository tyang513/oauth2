package com.github.tyang513.oauth2.client.groovy;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.Script;

/**
 * @author tao.yang
 * @date 2018-09-03
 */
public class GroovyCallService {

//    private Map<String, Script> groovyShellMap = new HashMap<>();
//
//    /**
//     * 根据脚本进行计算
//     *
//     * @param fscript
//     * @return
//     */
//    public Object calculate(String fscript, Map<String, Object> params) {
//        Script script = null;
//        if (groovyShellMap.containsKey(fscript)) {
//            script = groovyShellMap.get(fscript);
//        } else {
//            script = new GroovyShell().parse(fscript);
//            groovyShellMap.put(fscript, script);
//        }
//        Binding binding = new Binding();
//        for (Map.Entry<String, Object> entry : params.entrySet()) {
//            binding.setProperty(entry.getKey(), entry.getValue());
//        }
//        script.setBinding(binding);
//        return script.run();
//    }
//
//
//    public static void main(String[] args) {
//        GroovyCallService groovyCallService = new GroovyCallService();
//
////        long startTime = System.currentTimeMillis();
////        for (int i = 0; i <= 1000000000; i++) {
//            Map<String, Object> params = new HashMap<>();
//            params.put("a", 1.0);
//            params.put("b", -0.2);
//            Object o = groovyCallService.calculate("(a + b) / 3 * 100", params);
//            System.out.println(o);
////        }
////        System.out.println((System.currentTimeMillis() - startTime));
//    }

}
