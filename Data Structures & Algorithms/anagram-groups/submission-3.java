class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (used[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;

            char[] schar = strs[i].toCharArray();
            Arrays.sort(schar);

            for (int j = i + 1; j < strs.length; j++) {

                if (used[j]) {
                    continue;
                }

                if (strs[i].length() != strs[j].length()) {
                    continue;
                }

                char[] tchar = strs[j].toCharArray();
                Arrays.sort(tchar);

                if (Arrays.equals(schar, tchar)) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }

            list.add(group);
        }

        return list;
    }
}