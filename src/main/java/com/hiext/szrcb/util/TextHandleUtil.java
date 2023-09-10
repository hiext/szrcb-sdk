package com.hiext.szrcb.util;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TextHandleUtil {

    public static List<JSONObject> handle(String src, int dataSize, int properSize) {
        if (src == null || "".equals(src)) {
            return null;
        }
        //System.out.println(src);
        List<JSONObject> res = new ArrayList<>(dataSize);
        List<String> def = new ArrayList<>(properSize);
        src = src.replace("||", "| |");
        src = src.replace("||", "| |");
        //System.out.println(src);
        String[] arr = src.split("\\|");
        List<TextNode> data = new ArrayList<>(arr.length - properSize);
        for (int i = 0; i < arr.length; i++) {
            if (i < properSize) {
                def.add(arr[i]);
            } else {
                int index = i % properSize;
                String key = def.get(index);
                String value = arr[i];
                data.add(new TextNode(key, value));
            }
        }

        for (int i = 0; i < dataSize; i++) {
            // 开始位置
            int fromIndex = i * properSize;
            // 结束位置
            int toIndex = (i + 1) * properSize;
            List<TextNode> temp = data.subList(fromIndex, toIndex);
            JSONObject jsonObject = new JSONObject();
            for (TextNode textNode : temp) {
                jsonObject.put(textNode.getKey(), textNode.getValue().replaceAll("\r\n|\n", "").replace(" ", ""));
            }
            res.add(jsonObject);
        }
        return res;
    }

    public static void main(String[] args) {
        String text =
                "as_acno|as_acname|self_bal|upp_bal|use_bal|last_bal|last_usebal|freeze_bal|li_acno|999999|清分账簿|0.03|0.03|0.03|0.00|0.00|0.00||";
        List<JSONObject> te = handle(text, 1, 9);
        for (JSONObject jsonObject : te) {
            System.out.println(jsonObject.toJSONString());
        }
    }
}
