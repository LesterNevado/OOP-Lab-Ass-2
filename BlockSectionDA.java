import java.util.*;
import java.io.*;
public class BlockSectionDA{

    public BlockSectionDA() throws FileNotFoundException{
        Scanner blockSectionInput = new Scanner(new FileReader("blockSection.csv"));

        while(blockSectionInput.hasNext()){
            String blockSectionRow = new String();
            blockSectionRow =blockSectionInput.nextLine();
            String[] blockSectionRowSpecific = new String[3];
            blockSectionRowSpecific = blockSectionRow.split(",");

            BlockSection blockSection = new BlockSection();
            blockSection.setBlockCode(blockSectionRowSpecific[0].trim());
            blockSection.setDescription(blockSectionRowSpecific[1].trim());
            blockSection.setAdviser(blockSectionRowSpecific[2].trim());

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            blockSection.setStudentList(studentDA.getStudentList());
            blockSection.setTotalStudents(studentDA.getTotalStudents());

            System.out.println(blockSection);
        }
        
        
        blockSectionInput.close();
    }
    
}